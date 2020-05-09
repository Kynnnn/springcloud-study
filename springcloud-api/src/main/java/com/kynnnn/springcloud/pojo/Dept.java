package com.kynnnn.springcloud.pojo;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhudiwei
 * @version 1.0
 * @date 2020/5/9 15:55
 */
@Data
@NoArgsConstructor
@JSONType(orders={"deptNo","dname","dbSource"})
public class Dept {

    private Long deptNo;

    private String dname;

    private String dbSource;

}
