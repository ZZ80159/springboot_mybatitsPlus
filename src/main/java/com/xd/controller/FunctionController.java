package com.xd.controller;


import com.config.Result.Result;
import com.xd.service.FunctionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*")
public class FunctionController {
    @Resource
    private FunctionService functionService;


    @GetMapping ("/findFunction")
    public Result<Object> findFunction() {
        return functionService.selectFunctionViews();
    }


}
