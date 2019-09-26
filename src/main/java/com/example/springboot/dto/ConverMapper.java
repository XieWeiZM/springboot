package com.example.springboot.dto;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;

/**
 * @author Archer
 * @date 2019-07-29
 */
@Mapper
public interface ConverMapper {
    ConverMapper INSTANCE = Mappers.getMapper(ConverMapper.class);
    @Mappings({
            @Mapping(target="goodsName" , expression = "java(map.get(vo.getGoodsName()))")
    })
    TestDo converVoToDo(TestVo vo , Map<String,String> map);


    List<TestDo> converVoToDos(List<TestVo> lis);

    default int getInt(int a){
        return  a+1;
    }
}
