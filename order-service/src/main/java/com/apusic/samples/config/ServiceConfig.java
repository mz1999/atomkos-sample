package com.apusic.samples.config;

import com.apusic.samples.api.OrderService;
import com.apusic.samples.services.OrderServiceImpl;
import com.atomikos.remoting.spring.httpinvoker.TransactionalHttpInvokerServiceExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean(name = "/services/order")
    TransactionalHttpInvokerServiceExporter storageService(OrderServiceImpl orderService) {
        TransactionalHttpInvokerServiceExporter exporter = new TransactionalHttpInvokerServiceExporter();
        exporter.setService(orderService);
        exporter.setServiceInterface(OrderService.class);
        return exporter;
    }
}
