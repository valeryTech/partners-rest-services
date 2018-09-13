package tech.valery.partnersrestservices.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.valery.partnersrestservices.rest.CustomerRestController;
import tech.valery.partnersrestservices.rest.PartnerMappingRestController;
import tech.valery.partnersrestservices.services.CustomerService;
import tech.valery.partnersrestservices.services.CustomerServiceImpl;
import tech.valery.partnersrestservices.services.PartnerMappingService;
import tech.valery.partnersrestservices.services.PartnerMappingServiceImpl;

@Configuration
public class TestConfiguration {

    //services

    @Bean
    CustomerService customerService(){
        return new CustomerServiceImpl();
    }

    @Bean
    PartnerMappingService partnerMappingService(){
        return new PartnerMappingServiceImpl();
    }

    //controllers

    @Bean
    CustomerRestController customerRestController(){
        return new CustomerRestController(customerService());
    }

    @Bean
    PartnerMappingRestController partnerMappingRestController(){
        return new PartnerMappingRestController(partnerMappingService());
    }
}
