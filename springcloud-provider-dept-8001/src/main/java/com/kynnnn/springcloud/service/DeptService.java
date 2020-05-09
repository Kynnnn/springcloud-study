package com.kynnnn.springcloud.service;

import com.kynnnn.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 16:17
 */
public interface DeptService {

    void add(Dept dept);

    void delete(Long id);

    void update(Dept dept);

    Dept selectById(Long id);

    List<Dept> selectAll();

}
