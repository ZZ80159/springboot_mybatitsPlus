package com.xd;

import com.xd.entity.Functions;
import com.xd.mapper.FunctionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    private FunctionMapper functionMapper;

    @Test
    void contextLoads() {
//        Map<String, Object> oneMap = new HashMap<>();
//        oneMap.put("functionLevel", 0);
//        List<Function> functions = functionMapper.selectByMap(oneMap);
//        for (Function function : functions) {
//            System.out.println(function);
        List<Functions> functions = functionMapper.selectList(null);
        functions.forEach(System.out::println);
    }
}



