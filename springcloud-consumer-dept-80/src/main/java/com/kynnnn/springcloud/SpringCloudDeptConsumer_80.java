package com.kynnnn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 22:27
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringCloudDeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDeptConsumer_80.class,args);
    }

}
