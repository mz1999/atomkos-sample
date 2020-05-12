package com.apusic.samples.repositories;

import com.apusic.samples.models.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StorageRepository {

    @Autowired
    private JdbcTemplate atomikosJdbcTemplate;

    public Storage findByCommodityCode(String commodityCode) {
        String query = "SELECT * FROM db_bookstore.storage_tbl where commodity_code= ? ";
        Storage storage = atomikosJdbcTemplate.queryForObject(query, new Object[]{commodityCode}, new StorageRowMapper());
        return storage;
    }

    public void save(Storage storage) {
        String query = "UPDATE db_bookstore.storage_tbl set count = ? where id= ? ";
        atomikosJdbcTemplate.update(query, new Object[]{storage.getCount(), storage.getId()});
    }
}
