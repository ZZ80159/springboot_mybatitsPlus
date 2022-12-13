package com.xd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.config.Result.Result;
import com.xd.entity.Functions;
import com.xd.mapper.FunctionMapper;
import com.xd.service.FunctionService;
import com.xd.view.FunctionView;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author ZHANG
 * @description 针对表【function】的数据库操作Service实现
 * @createDate 2022-12-12 10:37:05
 */
@Service
public class FunctionServiceImpl extends ServiceImpl<FunctionMapper, Functions>
        implements FunctionService {

    @Resource
    private FunctionMapper functionMapper;

    //查询功能列表
    public Result<Object> selectFunctionViews() {
        Result<Object> result = new Result<>();
        List<FunctionView> functionViews = new ArrayList<>();
        try {
            //一级功能查询
            Map<String, Object> oneMap = new HashMap<>();
            oneMap.put("function_level", 0);
            List<Functions> functions = functionMapper.selectByMap(oneMap);

            //二级功能查询
            for (Functions function : functions) {
                FunctionView functionView = new FunctionView();

                functionView.setFunctionId(function.getFunctionId());
                functionView.setFunctionCode(function.getFunctionCode());
                functionView.setFunctionName(function.getFunctionName());
                functionView.setFunctionIcon(function.getFunctionIcon());
                functionView.setFunctionLevel(function.getFunctionLevel());
                functionView.setFunctionFather(function.getFunctionFather());

                Map<String, Object> towMap = new HashMap<>();
                towMap.put("function_father", functionView.getFunctionId());
                List<Functions> twoFunctions = functionMapper.selectByMap(towMap);
                functionView.setChildren(twoFunctions);

                functionViews.add(functionView);
            }
            result.setCode(200);
            result.setMsg("成功");
            result.setData(functionViews);
        } catch (Exception e) {
            result.setCode(500);
            result.setMsg(e.getMessage());
        }
        return result;

    }
}



