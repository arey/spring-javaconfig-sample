# Spring Java Config Sample #

Since Spring 3.0, the JavaConfig features are included in the Core Spring module. Thus Java Developer could move Spring beans definition from configuration XML files to Java classes.

Based on Spring Framework 4.0, Spring Data JPA 1.6, Spring Security 3.2 and Hibernate 4.3, this sample show how to use the Spring's new Java-configuration support and its @Configuration-annotated class.

The following classes, interfaces and annotations are used in the sample:
* JavaConfig main classes and annotations: @Configuration, @Bean, @ComponentScan, @Import, @ImportResource, @Profile, Environment, JndiObjectFactoryBean, @Scope 
* Spring Test: @WebAppConfiguration, @ContextConfiguration, @ActiveProfiles;  @ContextHierarchy
* Advanced Spring Framework features: @EnableTransactionManagement, @EnableAsync, @EnableCaching,  @EnableAspectJAutoProxy 
* Spring Data Jpa annotations: @EnableJpaRepositories
* Spring Security classes: @EnableWebMvcSecurity, WebSecurityConfigurerAdapter
* Spring MVC features: @EnableWebMvc, WebMvcConfigurerAdapter, RequestMappingHandlerAdapter, InternalResourceViewResolver, ignoreDefaultModelOnRedirect 


## Build Status ##

Travis : [![Build
Status](https://travis-ci.org/arey/spring-javaconfig-sample.png?branch=master)](https://travis-ci.org/arey/spring-javaconfig-sample)

Cloudbees Jenkins : [![Build
Status](https://javaetmoi.ci.cloudbees.com/job/spring-javaconfig-sample/badge/icon)](https://javaetmoi.ci.cloudbees.com/job/spring-javaconfig-sample/)


## Credits ##

* Uses [Maven](http://maven.apache.org/) as a build tool
* Uses [Cloudbees](http://www.cloudbees.com/foss) and [Travis CI](www.travis-ci.org) for continuous integration builds whenever code is pushed into GitHub

