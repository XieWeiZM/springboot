package com.example.springboot.service;

import com.alibaba.fastjson.JSON;
import com.example.springboot.dto.Csv;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;

/**
 * Create By Stream Wind On 2019/5/8
 */
public class CsvTest {

    public synchronized static <T> List<T> toNormalObject(File bytes, Class<T> clazz) {
        try {
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            MappingIterator<T> mappingIterator = new CsvMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).readerFor(clazz).with(schema).readValues(bytes);
            return mappingIterator.readAll();
        } catch (Exception e) {

        }
        return null;
    }

    public static void main(String[] args) {


        List<Csv> csvList = toNormalObject(new File("/Users/xiewei/Desktop/test.csv"), Csv.class);

        System.out.println(JSON.toJSONString(csvList));


    }
}
