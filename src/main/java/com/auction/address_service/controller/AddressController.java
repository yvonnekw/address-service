package com.auction.address_service.controller;


import com.auction.address_service.service.AddressService;

import com.auction.common.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address/")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/create-address")
    @ResponseStatus(HttpStatus.CREATED)
    public AddressResponse createAddress(@RequestBody AddressRequest addressRequest) {
        return addressService.createAddress(addressRequest);
    }

    @GetMapping("/get-all-addresses")
    @ResponseStatus(HttpStatus.OK)
    public List<AddressResponse> getAllAddresses() {
        return addressService.getAllAddresses();
    }
}
