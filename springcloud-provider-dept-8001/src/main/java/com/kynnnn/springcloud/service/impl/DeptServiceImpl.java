package com.kynnnn.springcloud.service.impl;

import com.kynnnn.springcloud.mapper.DeptMapper;
import com.kynnnn.springcloud.pojo.Dept;
import com.kynnnn.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 16:17
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper mapper;

    @Override
    public void add(Dept dept) {
        mapper.add(dept);
    }

    @Override
    public void delete(Long id) {
        mapper.delete(id);
    }

    @Override
    public void update(Dept dept) {
        mapper.update(dept);
    }

    @Override
    public Dept selectById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public List<Dept> selectAll() {
        return mapper.selectAll();
    }
}
