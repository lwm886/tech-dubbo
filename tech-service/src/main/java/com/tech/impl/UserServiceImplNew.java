package com.tech.impl;

import com.tech.UserService;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class UserServiceImplNew implements UserService {

    public String hello()  {
        log.info("服务调用 New");
        try {
            TimeUnit.SECONDS.sleep(5L);
            log.info("调用结束 New");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello word";
    }
}

