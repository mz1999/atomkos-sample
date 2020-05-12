package com.apusic.samples.api;

public interface StorageService {

    public void deduct(String commodityCode, int count);

    public Integer getStorageCount(String commodityCode);

}
