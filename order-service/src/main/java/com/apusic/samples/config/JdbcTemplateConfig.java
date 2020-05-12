package com.apusic.samples.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableConfigurationProperties({AtomikosDataSourceBean.class})
public class JdbcTemplateConfig {

    @Bean
    public JdbcTemplate atomikosJdbcTemplate(AtomikosDataSourceBean atomikosDataSourceBean) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(atomikosDataSourceBean);
        return jdbcTemplate;
    }
}
