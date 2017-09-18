package com.easylearnjava.services.sf.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.easylearnjava.services.sf.model.Customer;

@RepositoryRestResource(path="customers")
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
}
