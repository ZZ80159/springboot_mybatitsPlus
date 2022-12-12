package com.xd.controller;


import com.xd.service.FunctionService;
import com.xd.view.FunctionView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FunctionController {
    @Resource
    private FunctionService functionService;


    @PostMapping("/findFunction")
    public List<FunctionView> findFunction() {
        return functionService.selectFunctionViews();
    }


}
