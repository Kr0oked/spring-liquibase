package de.bobek.spring.liquibase.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<String> getCustomers() {
        return customerService.getCustomers().stream()
                .map(Customer::getName)
                .collect(toList());
    }
}
