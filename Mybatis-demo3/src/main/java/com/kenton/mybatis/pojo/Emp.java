package com.kenton.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: Kenton
 * @description 实体类
 * @date: 2022/6/20 14:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private Integer eid;
    private String empName;
    private Integer age;
    private char sex;
    private String email;
    private Dept dept;

    public Emp(Integer eid, String empName, Integer age, char sex, String email) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
