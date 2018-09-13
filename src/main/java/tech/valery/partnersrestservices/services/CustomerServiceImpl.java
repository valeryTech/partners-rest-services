package tech.valery.partnersrestservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tech.valery.partnersrestservices.model.Customer;
import tech.valery.partnersrestservices.repository.CustomerRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById(Long customerId) {
        return customerRepository.findById(customerId);
    }
}
