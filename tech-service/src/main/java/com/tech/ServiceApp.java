package com.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lw
 * @since 2021/10/11
 */
@ImportResource("provider.xml")
@EnableAutoConfiguration
public class ServiceApp {
    public static void main(String[] args) {
//        SpringApplication.run(ServiceApp.class);
        new SpringApplicationBuilder(ServiceApp.class).web(WebApplicationType.NONE).run();
    }
}
