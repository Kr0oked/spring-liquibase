# Spring Liquibase Demo

This demo shows a working example of a Liquibase Gradle DIFF with a SpringBoot application.

## Docker
```
$ docker build -t springliquibase src/docker
$ docker run -p 3306:3306 springliquibase
```

## Gradle
```
$ ./gradlew diff
```

```
> Task :diff
liquibase-plugin: Running the 'main' activity...
Starte Liquibase am Mo, 03 Sep 2018 22:33:05 MESZ (Version 3.6.2, kompiliert am 2018-07-03 11:28:09)
Mon Sep 03 22:33:05 CEST 2018 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.

Ergebnisse des Vergleichs:
Reference Database: null @ hibernate:spring:de.bobek?dialect=org.hibernate.dialect.MySQL5Dialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy (Default Schema: HIBERNATE)
Comparison Database: myUsername@172.17.0.1 @ jdbc:mysql://127.0.0.1:3306/my_database (Default Schema: my_database)
Compared Schemas: HIBERNATE -> my_database
Product Name:
     Reference:   'Hibernate'
     Target: 'MySQL'
Product Version:
     Reference:   '5.2.17.Final'
     Target: '8.0.12'
Missing Catalog(s): NONE
Unexpected Catalog(s): NONE
Changed Catalog(s): 
     HIBERNATE
          name changed from 'HIBERNATE' to 'my_database'
Missing Column(s): 
     HIBERNATE.customer.id
     HIBERNATE.customer.name
Unexpected Column(s): NONE
Changed Column(s): NONE
Missing Foreign Key(s): NONE
Unexpected Foreign Key(s): NONE
Changed Foreign Key(s): NONE
Missing Index(s): 
     IX_customerPK UNIQUE  ON HIBERNATE.customer(id)
Unexpected Index(s): NONE
Changed Index(s): NONE
Missing Primary Key(s): 
     customerPK on HIBERNATE.customer(id)
Unexpected Primary Key(s): NONE
Changed Primary Key(s): NONE
Missing Sequence(s): 
     hibernate_sequence
Unexpected Sequence(s): NONE
Changed Sequence(s): NONE
Missing Stored Procedure(s): NONE
Unexpected Stored Procedure(s): NONE
Changed Stored Procedure(s): NONE
Missing Table(s): 
     customer
Unexpected Table(s): NONE
Changed Table(s): NONE
Missing Unique Constraint(s): NONE
Unexpected Unique Constraint(s): NONE
Changed Unique Constraint(s): NONE
Missing View(s): NONE
Unexpected View(s): NONE
Changed View(s): NONE
Liquibase: Der Befehl 'diff' wurde erfolgreich ausgefÃ¼hrt.

BUILD SUCCESSFUL in 2s
2 actionable tasks: 2 executed
```
