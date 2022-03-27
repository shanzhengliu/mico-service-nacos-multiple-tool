package com.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class DataSourceConfig {

    @Bean
    @RefreshScope
    @ConfigurationProperties(prefix = "spring.datasource")
    public HikariDataSource hikariConfig() {
        return new HikariDataSource();
    }

    @Bean
    @RefreshScope
    public HikariDataSource HikariDataSource(HikariDataSource hikariConfig) {
        return new HikariDataSource(hikariConfig);
    }
}
