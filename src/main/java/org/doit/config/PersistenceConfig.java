package org.doit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:persistence.properties")
public class PersistenceConfig {
    @Autowired
    Environment env;

    @Bean
    public JdbcTemplate jdbcTemplate(@Autowired DriverManagerDataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("driverName"));
        dataSource.setUrl(env.getProperty("url"));
        dataSource.setUsername(env.getProperty("userNameforDatabase"));
        dataSource.setPassword(env.getProperty("password"));

        return dataSource;
    }
}
