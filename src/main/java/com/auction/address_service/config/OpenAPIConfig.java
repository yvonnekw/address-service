package com.auction.address_service.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenAPIConfig {
        @Bean
        public OpenAPI addressServiceAPI() {
            return new OpenAPI()
                    .info(new Info().title("Address Service API")
                            .description("This is the Rest API for the Address Service")
                            .version("v0.0.1")
                            .license(new License().name("Apache 2.0")));
        }
}


