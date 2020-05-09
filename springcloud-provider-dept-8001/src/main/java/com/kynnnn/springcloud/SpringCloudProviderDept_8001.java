package com.kynnnn.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 16:22
 */
@SpringBootApplication
@MapperScan("com.kynnnn.springcloud.mapper")
public class SpringCloudProviderDept_8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderDept_8001.class,args);
    }
}
