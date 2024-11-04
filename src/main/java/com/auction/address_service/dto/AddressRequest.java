package com.auction.address_service.dto;

import lombok.*;


@Builder
public record AddressRequest(
        Long userId,
        String street,
        String city,
        String state,
        String postalCode,
        String country,
        boolean isBillingAddress,
        boolean isShippingAddress) {

}
