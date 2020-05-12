package com.apusic.samples.service;

import com.apusic.samples.api.StorageService;
import com.apusic.samples.models.Storage;
import com.apusic.samples.repositories.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageRepository storageRepository;

    @Override
    @Transactional
    public void deduct(String commodityCode, int count) {

        if (count > 13) {
            throw new RuntimeException(count + " is too much.");
        }

        Storage storage = storageRepository.findByCommodityCode(commodityCode);
        storage.setCount(storage.getCount() - count);

        storageRepository.save(storage);
    }

    @Override
    @Transactional
    public Integer getStorageCount(String commodityCode) {
        Storage storage = storageRepository.findByCommodityCode(commodityCode);
        return storage.getCount();
    }
}
