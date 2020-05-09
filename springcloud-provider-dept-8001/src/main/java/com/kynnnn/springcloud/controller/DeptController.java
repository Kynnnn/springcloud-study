package com.kynnnn.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.kynnnn.springcloud.pojo.Dept;
import com.kynnnn.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 16:19
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService service;

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") Long id) {
        Dept dept = service.selectById(id);
        System.out.println(dept.toString());
        return JSON.toJSONString(dept);
    }

    @GetMapping("/list")
    public String get() {
        List<Dept> deptList = service.selectAll();
        return JSON.toJSONString(deptList);
    }

}
