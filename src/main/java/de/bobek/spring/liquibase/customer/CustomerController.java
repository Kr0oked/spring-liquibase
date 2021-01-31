package de.bobek.spring.liquibase.customer;

import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.stream.Collectors.toList;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    @NonNull
    private final CustomerService customerService;

    @GetMapping
    @Transactional(readOnly = true)
    public List<String> getCustomers() {
        return customerService.getCustomers().stream()
                .map(Customer::getName)
                .collect(toList());
    }
}
