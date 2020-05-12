package com.apusic.samples.controllers;


import com.apusic.samples.service.BusinessService;
import com.apusic.samples.utils.CodedResponse;
import com.apusic.samples.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/create")
    public CodedResponse createOrder() {
        String userId = Utils.randomAlphabeticString(12);
        String commodityCode = "2001";
        int count = Utils.getRandomNumberUsingNextInt(1, 20);

        CodedResponse response = null;
        int originalCount = businessService.getStorageCount(commodityCode);
        try {
            businessService.createOrder(userId, commodityCode, count);
            response = new CodedResponse(0, "success", userId, commodityCode, originalCount, count);
        } catch (Exception e) {
            e.printStackTrace();
            response = new CodedResponse(1, Utils.exception2String(e), userId, commodityCode, originalCount, count);
        }
        return response;
    }
}
