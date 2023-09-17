package com.inkslab.inkojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.inkslab.inkojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.inkslab")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.inkslab.inkojbackendserviceclient.service"})
public class inkojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(inkojBackendUserServiceApplication.class, args);
    }

}
