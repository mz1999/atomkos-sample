package com.apusic.samples.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({AtomikosDataSourceBean.class})
public class DatasourceConfig {

}
