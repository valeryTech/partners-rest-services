package tech.valery.partnersrestservices.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.valery.partnersrestservices.rest.CustomerRestController;
import tech.valery.partnersrestservices.services.CustomerService;
import tech.valery.partnersrestservices.services.CustomerServiceImpl;

@Configuration
public class TestConfiguration {

    @Bean
    CustomerService customerService(){
        return new CustomerServiceImpl();
    }

    @Bean
    CustomerRestController customerRestController(){
        return new CustomerRestController(customerService());
    }
}
