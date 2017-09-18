package com.easylearnjava.services.sf.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.easylearnjava.services.sf.model.Orders;

@RepositoryRestResource(path="orders")
public interface OrderRepository extends CrudRepository<Orders, Long>{
}
