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

##### Executed with Java 11

```
21:47:48: Executing 'diff'...

> Task :wrapper

BUILD SUCCESSFUL in 128ms
1 actionable task: 1 executed
> Task :compileJava UP-TO-DATE

> Task :diff
liquibase-plugin: Running the 'main' activity...
####################################################
##   _     _             _ _                      ##
##  | |   (_)           (_) |                     ##
##  | |    _  __ _ _   _ _| |__   __ _ ___  ___   ##
##  | |   | |/ _` | | | | | '_ \ / _` / __|/ _ \  ##
##  | |___| | (_| | |_| | | |_) | (_| \__ \  __/  ##
##  \_____/_|\__, |\__,_|_|_.__/ \__,_|___/\___|  ##
##              | |                               ##
##              |_|                               ##
##                                                ##
##  Get documentation at docs.liquibase.com       ##
##  Get certified courses at learn.liquibase.com  ##
##  Free schema change activity reports at        ##
##      https://hub.liquibase.com                 ##
##                                                ##
####################################################
Starte Liquibase am 21:47:50 (Version 4.5.0 #52, kompiliert am 2021-09-27 16:19+0000)
Liquibase Version: 4.5.0
Liquibase Community 4.5.0 by Datical
[2022-04-12 21:47:50] INFORMATION [liquibase.ext] Reading hibernate configuration hibernate:spring:de.bobek?dialect=org.hibernate.dialect.MySQL5Dialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy
[2022-04-12 21:47:50] INFORMATION [liquibase.ext] Found package de.bobek
[2022-04-12 21:47:50] INFO [org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation] HHH000204: Processing PersistenceUnitInfo [name: default]
[2022-04-12 21:47:50] INFO [org.hibernate.Version logVersion] HHH000412: Hibernate ORM core version 5.6.7.Final
[2022-04-12 21:47:50] INFO [org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>] HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
[2022-04-12 21:47:51] WARN [org.hibernate.engine.jdbc.connections.internal.ConnectionProviderInitiator initiateService] HHH000181: No appropriate connection provider encountered, assuming application will be supplying connections
[2022-04-12 21:47:51] WARN [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator initiateService] HHH000342: Could not obtain connection to query metadata
java.lang.UnsupportedOperationException: The application must supply JDBC connections
	at org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl.getConnection(UserSuppliedConnectionProviderImpl.java:44)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:181)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:175)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:173)
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:127)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1460)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1494)
	at liquibase.ext.hibernate.database.HibernateEjb3Database.buildMetadataFromPath(HibernateEjb3Database.java:59)
	at liquibase.ext.hibernate.database.HibernateDatabase.buildMetadata(HibernateDatabase.java:143)
	at liquibase.ext.hibernate.database.HibernateDatabase.setConnection(HibernateDatabase.java:83)
	at liquibase.database.DatabaseFactory.findCorrectDatabaseImplementation(DatabaseFactory.java:121)
	at liquibase.database.DatabaseFactory.openDatabase(DatabaseFactory.java:141)
	at liquibase.integration.commandline.CommandLineUtils.createDatabaseObject(CommandLineUtils.java:90)
	at liquibase.integration.commandline.Main.createReferenceDatabaseFromCommandParams(Main.java:2194)
	at liquibase.integration.commandline.Main.doMigration(Main.java:1601)
	at liquibase.integration.commandline.Main$1.lambda$run$0(Main.java:402)
	at liquibase.Scope.lambda$child$0(Scope.java:177)
	at liquibase.Scope.child(Scope.java:186)
	at liquibase.Scope.child(Scope.java:176)
	at liquibase.Scope.child(Scope.java:155)
	at liquibase.integration.commandline.Main$1.run(Main.java:401)
	at liquibase.integration.commandline.Main$1.run(Main.java:225)
	at liquibase.Scope.child(Scope.java:186)
	at liquibase.Scope.child(Scope.java:162)
	at liquibase.integration.commandline.Main.run(Main.java:225)
	at liquibase.command.AbstractCliWrapperCommandStep.run(AbstractCliWrapperCommandStep.java:32)
	at liquibase.command.CommandScope.execute(CommandScope.java:147)
	at liquibase.integration.commandline.CommandRunner.call(CommandRunner.java:45)
	at liquibase.integration.commandline.CommandRunner.call(CommandRunner.java:15)
	at picocli.CommandLine.executeUserObject(CommandLine.java:1953)
	at picocli.CommandLine.access$1300(CommandLine.java:145)
	at picocli.CommandLine$RunLast.executeUserObjectOfLastSubcommandWithSameParent(CommandLine.java:2358)
	at picocli.CommandLine$RunLast.handle(CommandLine.java:2352)
	at picocli.CommandLine$RunLast.handle(CommandLine.java:2314)
	at picocli.CommandLine$AbstractParseResultHandler.execute(CommandLine.java:2179)
	at picocli.CommandLine$RunLast.execute(CommandLine.java:2316)
	at picocli.CommandLine.execute(CommandLine.java:2078)
	at liquibase.integration.commandline.LiquibaseCommandLine.lambda$execute$1(LiquibaseCommandLine.java:315)
	at liquibase.Scope.child(Scope.java:186)
	at liquibase.Scope.child(Scope.java:162)
	at liquibase.integration.commandline.LiquibaseCommandLine.execute(LiquibaseCommandLine.java:287)
	at liquibase.integration.commandline.LiquibaseCommandLine.main(LiquibaseCommandLine.java:81)

[2022-04-12 21:47:51] INFO [org.hibernate.dialect.Dialect <init>] HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
[2022-04-12 21:47:51] INFO [org.hibernate.envers.boot.internal.EnversServiceImpl configure] Envers integration enabled? : true
[2022-04-12 21:47:51] INFO [org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService] HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
[2022-04-12 21:47:51] INFO [org.hibernate.dialect.Dialect <init>] HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Using dialect org.hibernate.dialect.MySQL5Dialect

Ergebnisse des Vergleichs:
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found table customer
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found table customer
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found table customer
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found primary key customerPK
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found column id bigint
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found column name varchar(255)
[2022-04-12 21:47:51] INFORMATION [liquibase.ext] Found column timestamp datetime
Liquibase command 'diff' was executed successfully.
Reference Database: null @ hibernate:spring:de.bobek?dialect=org.hibernate.dialect.MySQL5Dialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy (Default Schema: HIBERNATE)
Comparison Database: myUsername@10.0.2.100 @ jdbc:mysql://127.0.0.1:3306/my_database?useSSL=false&allowPublicKeyRetrieval=true (Default Schema: my_database)
Compared Schemas: HIBERNATE -> my_database
Product Name:
     Reference:   'Hibernate'
     Target: 'MySQL'
Product Version:
     Reference:   '5.6.7.Final'
     Target: '8.0.23'
Missing Catalog(s): NONE
Unexpected Catalog(s): NONE
Changed Catalog(s):
     HIBERNATE
          name changed from 'HIBERNATE' to 'my_database'
Missing Column(s):
     HIBERNATE.customer.id
     HIBERNATE.customer.name
     HIBERNATE.customer.timestamp
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

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.4.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 2s
2 actionable tasks: 1 executed, 1 up-to-date
21:47:51: Execution finished 'diff'.
```
