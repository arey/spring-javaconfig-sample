# Spring Java Config Sample #
[![Build Status](https://github.com/arey/spring-javaconfig-sample/actions/workflows/maven-build.yml/badge.svg)](https://github.com/arey/spring-javaconfig-sample/actions/workflows/maven-build.yml)

Since Spring Framework 3.0, the JavaConfig features are included in the Core Spring module. Thus Java Developer could move Spring beans definition from configuration XML files to Java classes.

Based on Spring Framework 5.3, Spring Data JPA 2.6, Spring Security 5.6 and Hibernate 5.6, this sample show how to use the Spring's new Java-configuration support and its @Configuration-annotated class.

The following classes, interfaces and annotations are used in the sample:
* JavaConfig main classes and annotations: `@Configuration`, `@Bean`, `@ComponentScan`, `@Import`, `@ImportResource`, `@Profile`, `Environment`, `JndiObjectFactoryBean`, `@Scope` 
* Spring Test: `@WebAppConfiguration`, `@ContextConfiguration`, `@ActiveProfiles`,  `@ContextHierarchy`
* Advanced Spring Framework features: `@EnableTransactionManagement`, `@EnableAsync`, `@EnableCaching`,  `@EnableAspectJAutoProxy`
* Spring Data JPA annotations: `@EnableJpaRepositories`
* Spring Security classes: `@EnableWebMvcSecurity`, `WebSecurityConfigurerAdapter`
* Spring MVC features: `@EnableWebMvc`, `WebMvcConfigurerAdapter`, `RequestMappingHandlerAdapter`, `InternalResourceViewResolver`, `ignoreDefaultModelOnRedirect` 


## Quick start ##

Download the code with git:
```
git clone git://github.com/arey/spring-javaconfig-sample.git
```

Compile the code with maven:
```
mvn clean install
```

If you're using an IDE that supports Maven-based projects (InteliJ Idea, Netbeans or m2Eclipse), you can import the project directly from its POM. 
Otherwise, generate IDE metadata with the related IDE maven plugin:
```
mvn eclipse:clean eclipse:eclipse
```

## Documentation ##

French articles on the [javaetmoi.com](http://javaetmoi.com) blog:

* [Configurez Spring en Java](http://javaetmoi.com/2014/06/spring-framework-java-configuration/)

## Credits ##

* Uses [Maven](http://maven.apache.org/) as a build tool
* Uses GitHub Actions for continuous integration builds

