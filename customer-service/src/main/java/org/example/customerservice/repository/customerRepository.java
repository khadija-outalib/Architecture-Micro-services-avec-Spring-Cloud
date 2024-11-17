package org.example.customerservice.repository;

import org.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface customerRepository extends JpaRepository  <Customer,Long>{

}
