package com.tech.impl;

import com.tech.UserService;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class UserServiceImpl implements UserService {

    public String hello()  {
        log.info("服务调用");
        try {
            TimeUnit.SECONDS.sleep(5L);
            log.info("调用结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello word";
    }
}

