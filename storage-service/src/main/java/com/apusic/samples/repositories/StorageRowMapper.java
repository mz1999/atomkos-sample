package com.apusic.samples.repositories;

import com.apusic.samples.models.Storage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StorageRowMapper implements RowMapper<Storage> {

    @Override
    public Storage mapRow(ResultSet rs, int rowNum) throws SQLException {
        Storage storage = new Storage();

        storage.setCommodityCode(rs.getString("commodity_code"));
        storage.setCount(rs.getInt("count"));
        storage.setId(rs.getLong("id"));
        return storage;
    }
}
