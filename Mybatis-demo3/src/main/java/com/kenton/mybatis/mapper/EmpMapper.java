package com.kenton.mybatis.mapper;

import com.kenton.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpMapper {

    // 查询所有员工信息
    List<Emp> getAllEmp();

    // 查询员工以及员工对应的部门信息
    Emp getEmpAndDept(@Param("eid") Integer id);

    Emp getEmpAndDeptTwo(@Param("eid") Integer id);

    // 通过分步查询 查询员工以及员工所对应的部门信息
    // 查询第一步:查询员工信息
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    // 通过分步查询部门以及部门中所有员工的信息 分步查询第二步:根据did查询员工信息
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
