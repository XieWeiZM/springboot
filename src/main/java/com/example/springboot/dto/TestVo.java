package com.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Archer
 * @date 2019-07-29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestVo {
    private String goodsName;
    private Integer goodsNumber;
}
