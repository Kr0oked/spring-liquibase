package de.bobek.spring.liquibase.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class MyTable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String myValue;
}
