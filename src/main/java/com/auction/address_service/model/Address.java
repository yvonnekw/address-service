package com.auction.address_service.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Validated
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private Long userId;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    private boolean isBillingAddress;
    private boolean isShippingAddress;
}