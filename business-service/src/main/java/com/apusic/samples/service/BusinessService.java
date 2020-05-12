package com.apusic.samples.service;

import com.apusic.samples.api.OrderService;
import com.apusic.samples.api.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BusinessService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private StorageService storageService;

    @Transactional
    public void createOrder(String userId, String commodityCode, Integer count) {
        orderService.create(userId, commodityCode, count);
        storageService.deduct(commodityCode, count);
    }

    @Transactional
    public int getStorageCount(String commodityCode) {
        return storageService.getStorageCount(commodityCode);
    }
}
