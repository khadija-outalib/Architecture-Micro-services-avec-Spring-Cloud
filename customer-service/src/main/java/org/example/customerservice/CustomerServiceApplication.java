package org.example.customerservice;

import org.example.customerservice.entities.Customer;
import org.example.customerservice.repository.customerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(customerRepository customerRepository) {

        return args -> {
            customerRepository.save(Customer.builder().firstName("Adam").email("adam@example.com").build());
            customerRepository.save(Customer.builder().firstName("khadija").email("khadija@example.com").build());
            customerRepository.save(Customer.builder().firstName("zahra").email("zahra@example.com").build());
            customerRepository.save(Customer.builder().firstName("noura").email("noura@example.com").build());
            customerRepository.save(Customer.builder().firstName("itimad").email("itimad@example.com").build());
            customerRepository.findAll().forEach(System.out::println);


        };



    }


}
