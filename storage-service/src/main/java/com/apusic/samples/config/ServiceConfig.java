package com.apusic.samples.config;

import com.apusic.samples.api.StorageService;
import com.apusic.samples.service.StorageServiceImpl;
import com.atomikos.remoting.spring.httpinvoker.TransactionalHttpInvokerServiceExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean(name = "/services/storage")
    TransactionalHttpInvokerServiceExporter storageService(StorageServiceImpl storageService) {
        TransactionalHttpInvokerServiceExporter exporter = new TransactionalHttpInvokerServiceExporter();
        exporter.setService(storageService);
        exporter.setServiceInterface(StorageService.class);
        return exporter;
    }

}
