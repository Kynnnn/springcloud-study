package com.kynnnn.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.kynnnn.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 22:11
 */
@RestController
@RequestMapping("/dept")
public class DeptConsumerController {

    // url,实体：map，
    @Autowired
    private RestTemplate template;

    private final static String REST_PRE="http://localhost:8001";

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") Long id) {
        Dept dept = template.getForObject(REST_PRE + "/dept/get/" + id, Dept.class);
        return JSON.toJSONString(dept);
    }

    @GetMapping("/list")
    public String getAll() {
        List<Dept> deptList = template.getForObject(REST_PRE + "/dept/list", List.class);
        return JSON.toJSONString(deptList);
    }


}
