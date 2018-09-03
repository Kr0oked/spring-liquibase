package de.bobek.spring.liquibase.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    @PostConstruct
    public void printCustomersSize() {
        long count = customerRepository.count();
        log.info("Customer table contains {} entries", count);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
