package de.bobek.spring.liquibase.customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;
}
