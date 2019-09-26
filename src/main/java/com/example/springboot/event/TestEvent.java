package com.example.springboot.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Archer
 * @date 2019-08-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestEvent {
    private String name;
    private Integer age;


}
