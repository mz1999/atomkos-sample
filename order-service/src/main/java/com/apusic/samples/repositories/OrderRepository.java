package com.apusic.samples.repositories;


import com.apusic.samples.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderRepository {

    @Autowired
    private JdbcTemplate atomikosJdbcTemplate;

    public void save(Order order) {
        String query = "INSERT INTO db_bookstore.order_tbl (user_id,commodity_code, count, money) values(?, ?, ?, ?)";
        atomikosJdbcTemplate.update(query,
                new Object[]{order.getUserId(), order.getCommodityCode(), order.getCount(), order.getMoney()});
    }
}
