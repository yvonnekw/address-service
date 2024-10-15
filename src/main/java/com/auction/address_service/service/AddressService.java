package com.auction.address_service.service;

import com.auction.address_service.model.Address;
import com.auction.address_service.repository.AddressRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auction.address_service.dto.AddressRequest;
import com.auction.address_service.dto.AddressResponse;

import java.util.List;


@Slf4j
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressResponse createAddress(AddressRequest addressRequest) {

        Address address = Address.builder()
                .userId(addressRequest.userId())
                .street(addressRequest.street())
                .city(addressRequest.city())
                .state(addressRequest.state())
                .postalCode(addressRequest.postalCode())
                .country(addressRequest.country())
                .isBillingAddress(addressRequest.isBillingAddress())
                .isShippingAddress(addressRequest.isShippingAddress())
                .build();
        addressRepository.save(address);
        log.info("Address with id {} is saved. ", address.getAddressId());
        return new AddressResponse(address.getAddressId(), address.getUserId(), address.getStreet(), address.getCity(), address.getState(), address.getPostalCode(), address.getCountry(), address.isShippingAddress(), address.isBillingAddress());
    }

    public List<AddressResponse> getAllAddresses() {
        return addressRepository.findAll()
                .stream()
                .map(address -> new AddressResponse(address.getUserId(), address.getAddressId(), address.getStreet(), address.getCity(), address.getState(), address.getCountry(), address.getPostalCode(), address.isBillingAddress(), address.isShippingAddress()))
                .toList();
    }
}