package com.xd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.config.Result.Result;
import com.xd.entity.Functions;

/**
* @author ZHANG
* @description 针对表【function】的数据库操作Service
* @createDate 2022-12-12 10:37:05
*/
public interface FunctionService extends IService<Functions> {
    Result<Object> selectFunctionViews();

}
