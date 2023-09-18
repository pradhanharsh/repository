package com.casestudy.cataloguemgmt.apiproductcatalogueservice1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("product-service", r -> r
                .path("/products/**") // Define the path pattern to match
                .uri("http://localhost:8080")) 
            .build();
    }
}
