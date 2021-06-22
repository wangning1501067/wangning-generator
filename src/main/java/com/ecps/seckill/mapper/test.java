package com.ecps.seckill.mapper;

import java.math.BigDecimal;

public class test {

    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("2.33");
        System.out.println(num.longValue());
        System.out.println(num.doubleValue());
        System.out.println(num.intValue());
        System.out.println(num.abs());

        System.out.println(num.multiply(new BigDecimal("-1")));

        System.out.println(num.subtract(num.add(num)));
    }
}
