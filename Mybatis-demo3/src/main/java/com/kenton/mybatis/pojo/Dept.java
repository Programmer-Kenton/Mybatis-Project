package com.kenton.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Kenton
 * @description 实体类 部门
 * @date: 2022/6/20 14:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer did;
    private String deptName;
    private List<Emp> emps;
}
