package tech.valery.partnersrestservices.services;

import tech.valery.partnersrestservices.model.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> findById(Long customerId);
}
