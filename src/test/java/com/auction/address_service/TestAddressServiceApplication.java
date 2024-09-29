package com.auction.address_service;

import org.springframework.boot.SpringApplication;

public class TestAddressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(AddressServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
