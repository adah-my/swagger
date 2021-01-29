package com.muyi.swagger.controller;

import com.muyi.swagger.pojo.TkUserPojo;
import com.muyi.swagger.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2测试接口
 */
@EnableSwagger2
@RestController
@Slf4j
public class UserController{

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public Result<TkUserPojo> addUser(@RequestBody TkUserPojo user){
        log.info("user:{}", user);
        return Result.success(user);
    }
}
