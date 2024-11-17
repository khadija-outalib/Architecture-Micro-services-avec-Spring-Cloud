package org.example.inventoryservice;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {

		return args -> {
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("S22").price(3000).quantity(120)
					.build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("S23").price(4000).quantity(100)
					.build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("S24").price(1500).quantity(200)
					.build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("S21").price(3000).quantity(40)
					.build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("S20").price(1000).quantity(420)
					.build());
			productRepository.findAll().forEach(System.out::println);


		};
	}
}
