package com.easylearnjava.services.sf.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.easylearnjava.services.sf.model.Address;

@RepositoryRestResource(path="address")
public interface AddressRepository extends CrudRepository<Address, Long>{
}
