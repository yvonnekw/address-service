package com.auction.address_service.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private Long userId;        // Reference to the UserService's User ID

    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    private boolean isBillingAddress;   // Optional: To differentiate billing vs shipping address
    private boolean isShippingAddress;  // Optional: To differentiate billing vs shipping address
}