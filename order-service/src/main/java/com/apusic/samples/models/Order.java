package com.apusic.samples.models;


import java.math.BigDecimal;

public class Order {

    private Long id;

    private String userId;

    private String commodityCode;

    private BigDecimal money;

    private Integer count;

    public Order() {
    }

    public Order(String userId, String commodityCode, BigDecimal money, Integer count) {
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.money = money;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}