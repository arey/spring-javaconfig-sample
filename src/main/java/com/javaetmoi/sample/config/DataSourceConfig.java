/**
 * Copyright 2014 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.javaetmoi.sample.config;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

/**
 * Depending active spring profile, lookup RDBMS DataSource from JNDI or from an embbeded H2 database.
 */
@Configuration
@PropertySource({ "classpath:com/javaetmoi/sample/config/datasource.properties" })
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean
    @Profile("javaee")
    public JndiObjectFactoryBean dataSource() throws IllegalArgumentException {
        JndiObjectFactoryBean dataSource = new JndiObjectFactoryBean();
        dataSource.setExpectedType(DataSource.class);
        dataSource.setJndiName(env.getProperty("jdbc.jndiDataSource"));
        return dataSource;
    }

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
