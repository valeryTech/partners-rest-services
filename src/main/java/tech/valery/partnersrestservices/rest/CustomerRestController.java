package tech.valery.partnersrestservices.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.valery.partnersrestservices.model.Customer;
import tech.valery.partnersrestservices.services.CustomerService;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "{customerId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> getCustomerDetails(@PathVariable Long customerId){

        Optional<Customer> customerOptional = customerService.findById(customerId);

        if(customerOptional.isPresent()){
            return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }
}
