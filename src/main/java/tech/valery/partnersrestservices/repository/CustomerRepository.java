package tech.valery.partnersrestservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.valery.partnersrestservices.model.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Override
    Optional<Customer> findById(Long customerId);
}
