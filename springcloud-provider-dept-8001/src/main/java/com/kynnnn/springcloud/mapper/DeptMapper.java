package com.kynnnn.springcloud.mapper;

import com.kynnnn.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 16:11
 */
@Mapper
@Repository
public interface DeptMapper {

    void add(Dept dept);

    void delete(Long id);

    void update(Dept dept);

    Dept selectById(Long id);

    List<Dept> selectAll();

}
