package com.trainings.jpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by jlising on 1/25/16.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.trainings.jpa.dao")

@ComponentScan(basePackages = {"com.trainings.jpa"})
@IntegrationComponentScan(basePackages = "com.trainings.jpa.endpoint")
public class JpaConfig {
}
