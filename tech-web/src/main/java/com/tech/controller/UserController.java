package com.tech.controller;

import com.tech.FileService;
import com.tech.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lw
 * @since 2021/10/11
 */
@RestController
public class UserController {

    //dubbo.registry.address=N/A 需要通过url配置服务地址
//    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")

    //check 默认为true,启动依赖检查，如果依赖的UserService不存在（注册中心中没有该服务实例信息）则启动失败
//    @DubboReference(version = "1.0.0",check = false)

    //timeout 服务调用时的超时时间，达到该时间服务消费者报超时异常
    //cluster配置集群容错策略
//    failover （默认容错策略） 失败重试，默认重试2次
//    failfast 快速失败，不进行重试
//    forking 并行调用多个服务器，只要有一个成功就返回
//    @DubboReference(version = "1.0.0",timeout = 3000,retries = 1,cluster = "failover")
//    private UserService userService;
//
//    @DubboReference(version = "1.0.0")
//    private FileService fileService;

    @Autowired
    private UserService userService;
    @Autowired
    private FileService fileService;

    @GetMapping("hello")
    public String hello() {
        return userService.hello();
    }

    @GetMapping("upload")
    public String upload(){
        fileService.upload("hello word");
        return "hello word";
    }
}
