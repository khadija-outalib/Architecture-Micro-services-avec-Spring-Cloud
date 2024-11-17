package org.example.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all" ,types = Product.class)
public interface ProductPorjection {
     String getName();
     double getPrice();
     int getQuantity();
}


