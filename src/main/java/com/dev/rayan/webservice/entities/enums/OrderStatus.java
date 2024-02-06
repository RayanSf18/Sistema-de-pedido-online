package com.dev.rayan.webservice.entities.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public static OrderStatus getOrderStatus(int code) {
        for(OrderStatus orderStatus : OrderStatus.values()) {
            if(orderStatus.getCode() == code) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

}
