# Spring Liquibase Demo

This demo shows an issue of Spring Boot projects which use Gradle and Liquibase.
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

```
Welcome to Gradle 4.8!

Here are the highlights of this release:
 - Dependency locking
 - Maven Publish and Ivy Publish plugins improved and marked stable
 - Incremental annotation processing enhancements
 - APIs to configure tasks at creation time

For more details see https://docs.gradle.org/4.8/release-notes.html


> Task :diff FAILED
liquibase-plugin: Running the 'main' activity...
Starte Liquibase am Di, 28 Aug 2018 14:04:33 MESZ (Version 3.6.2, kompiliert am 2018-07-03 11:28:09)
Tue Aug 28 14:04:33 CEST 2018 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
Unerwarteter Fehler bei der AusfÃ¼hrung von Liquibase: Unable to resolve persistence unit root URL
liquibase.exception.DatabaseException: javax.persistence.PersistenceException: Unable to resolve persistence unit root URL
        at liquibase.integration.commandline.CommandLineUtils.createDatabaseObject(CommandLineUtils.java:132)
        at liquibase.integration.commandline.Main.createReferenceDatabaseFromCommandParams(Main.java:1408)
        at liquibase.integration.commandline.Main.doMigration(Main.java:1005)
        at liquibase.integration.commandline.Main.run(Main.java:191)
        at liquibase.integration.commandline.Main.main(Main.java:129)
Caused by: javax.persistence.PersistenceException: Unable to resolve persistence unit root URL
        at org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager.determineDefaultPersistenceUnitRootUrl(DefaultPersistenceUnitManager.java:637)
        at org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager.preparePersistenceUnitInfos(DefaultPersistenceUnitManager.java:459)
        at liquibase.ext.hibernate.database.HibernateSpringPackageDatabase.createEntityManagerFactory(HibernateSpringPackageDatabase.java:79)
        at liquibase.ext.hibernate.database.HibernateEjb3Database.buildMetadataFromPath(HibernateEjb3Database.java:51)
        at liquibase.ext.hibernate.database.HibernateDatabase.buildMetadata(HibernateDatabase.java:136)
        at liquibase.ext.hibernate.database.HibernateDatabase.setConnection(HibernateDatabase.java:75)
        at liquibase.database.DatabaseFactory.findCorrectDatabaseImplementation(DatabaseFactory.java:129)
        at liquibase.database.DatabaseFactory.openDatabase(DatabaseFactory.java:149)
        at liquibase.integration.commandline.CommandLineUtils.createDatabaseObject(CommandLineUtils.java:97)
        ... 4 common frames omitted
Caused by: java.io.FileNotFoundException: class path resource [] cannot be resolved to URL because it does not exist
        at org.springframework.core.io.ClassPathResource.getURL(ClassPathResource.java:195)
        at org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager.determineDefaultPersistenceUnitRootUrl(DefaultPersistenceUnitManager.java:633)
        ... 12 common frames omitted


Bitte verwenden Sie die '--logLevel'-Option, um mehr Informationen zu erhalten.

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':diff'.
> Process 'command '/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.181-7.b13.fc28.x86_64/bin/java'' finished with non-zero exit value 255

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 1s
1 actionable task: 1 executed
```
