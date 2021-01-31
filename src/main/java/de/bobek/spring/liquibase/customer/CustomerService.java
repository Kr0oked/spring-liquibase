package de.bobek.spring.liquibase.customer;

import java.util.List;

import javax.annotation.PostConstruct;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.transaction.annotation.Propagation.MANDATORY;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    @NonNull
    private final CustomerRepository customerRepository;

    @PostConstruct
    public void printCustomersSize() {
        var count = customerRepository.count();
        log.info("Customer table contains {} entries", count);
    }

    @Transactional(propagation = MANDATORY, readOnly = true)
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
