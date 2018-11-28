package de.bobek.spring.liquibase.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostConstruct
    public void printCustomersSize() {
        long count = customerRepository.count();
        log.info("Customer table contains {} entries", count);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
