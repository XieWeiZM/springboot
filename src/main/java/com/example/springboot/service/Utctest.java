package com.example.springboot.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

/**
 * Create By Stream Wind On 2019/5/6
 */
public class Utctest {


    public static void main(String[] args) throws ParseException {

//时间当前瞬时点
        Instant instant = new Date().toInstant();

        //非洲时间 尼日利亚
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Lagos"));

        //当天尼日利亚时间  0点的时间戳
        System.out.println( zonedDateTime.withHour(0).withMinute(0).withSecond(0).toInstant().toEpochMilli());




        SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd");

        TimeZone utcZone = TimeZone.getTimeZone("UTC");
        sf.setTimeZone(utcZone);

        Date parse = sf.parse("2019-05-06");

        System.out.println(parse.getTime());

        System.out.println(UUID.randomUUID());
    }
}
