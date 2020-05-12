package com.apusic.samples.config;

import com.apusic.samples.api.OrderService;
import com.apusic.samples.api.StorageService;
import com.atomikos.remoting.spring.httpinvoker.TransactionalHttpInvokerRequestExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class ServiceConfig {

    @Bean
    public HttpInvokerProxyFactoryBean orderService() {
        HttpInvokerProxyFactoryBean orderService = new HttpInvokerProxyFactoryBean();
        orderService.setHttpInvokerRequestExecutor(httpInvokerRequestExecutor());
        orderService.setServiceUrl("http://localhost:8082/services/order");
        orderService.setServiceInterface(OrderService.class);
        return orderService;
    }

    @Bean
    public HttpInvokerProxyFactoryBean storageService() {
        HttpInvokerProxyFactoryBean storageService = new HttpInvokerProxyFactoryBean();
        storageService.setHttpInvokerRequestExecutor(httpInvokerRequestExecutor());
        storageService.setServiceUrl("http://localhost:8081/services/storage");
        storageService.setServiceInterface(StorageService.class);
        return storageService;
    }

    @Bean
    public TransactionalHttpInvokerRequestExecutor httpInvokerRequestExecutor() {
        TransactionalHttpInvokerRequestExecutor httpInvokerRequestExecutor = new TransactionalHttpInvokerRequestExecutor();
        return httpInvokerRequestExecutor;
    }

}
