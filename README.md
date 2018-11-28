# Spring Liquibase Demo

This demo shows an issue of Spring Boot projects which use Gradle and Liquibase with Java 11.
It is not possible to create a DIFF with the Liquibase Gradle plugin.

## Docker
```
$ docker build -t springliquibase src/docker
$ docker run -p 3306:3306 springliquibase
```

## Gradle
```
$ ./gradlew diff
```

##### Executed with Java 8
```
21:59:53: Executing task 'diff'...

> Task :wrapper

BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
> Task :compileJava UP-TO-DATE

> Task :diff
liquibase-plugin: Running the 'main' activity...
Starte Liquibase am Mi, 28 Nov 2018 21:59:53 MEZ (Version 3.6.2, kompiliert am 2018-07-03 11:28:09)

Ergebnisse des Vergleichs:
Reference Database: null @ hibernate:spring:de.bobek?dialect=org.hibernate.dialect.MySQL5Dialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy (Default Schema: HIBERNATE)
Comparison Database: myUsername@172.17.0.1 @ jdbc:mysql://127.0.0.1:3306/my_database?useSSL=false&allowPublicKeyRetrieval=true (Default Schema: my_database)
Compared Schemas: HIBERNATE -> my_database
Product Name:
     Reference:   'Hibernate'
     Target: 'MySQL'
Product Version:
     Reference:   '5.3.7.Final'
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
2 actionable tasks: 1 executed, 1 up-to-date
21:59:55: Task execution finished 'diff'.
```

##### Executed with Java 11
```
22:07:03: Executing task 'diff'...

> Task :wrapper

BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
> Task :compileJava

> Task :diff FAILED
liquibase-plugin: Running the 'main' activity...
Starte Liquibase am Mi., 28 Nov. 2018 22:07:04 MEZ (Version 3.6.2, kompiliert am 2018-07-03 11:28:09)
Unerwarteter Fehler bei der Ausführung von Liquibase: URI is not hierarchical
java.lang.IllegalArgumentException: URI is not hierarchical
	at java.base/java.io.File.<init>(File.java:418)
	at liquibase.resource.FileSystemResourceAccessor.addRootPath(FileSystemResourceAccessor.java:51)
	at liquibase.resource.AbstractResourceAccessor.init(AbstractResourceAccessor.java:39)
	at liquibase.resource.FileSystemResourceAccessor.init(FileSystemResourceAccessor.java:44)
	at liquibase.resource.FileSystemResourceAccessor.<init>(FileSystemResourceAccessor.java:26)
	at liquibase.integration.commandline.Main.doMigration(Main.java:949)
	at liquibase.integration.commandline.Main.run(Main.java:191)
	at liquibase.integration.commandline.Main.main(Main.java:129)


Bitte verwenden Sie die '--logLevel'-Option, um mehr Informationen zu erhalten.

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':diff'.
> Process 'command '/usr/lib/jvm/java-11-openjdk-11.0.1.13-4.fc29.x86_64/bin/java'' finished with non-zero exit value 255

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 1s
2 actionable tasks: 2 executed
Process 'command '/usr/lib/jvm/java-11-openjdk-11.0.1.13-4.fc29.x86_64/bin/java'' finished with non-zero exit value 255
22:07:04: Task execution finished 'diff'.
```
