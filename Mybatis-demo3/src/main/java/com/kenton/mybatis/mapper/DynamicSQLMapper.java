package com.kenton.mybatis.mapper;

import com.kenton.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    // 多条件查询
    List<Emp> getEmpByCondition(Emp emp);

    // 测试choose when otherwise
    List<Emp> getEmpByChoose(Emp emp);

    // 通过数组实现批量删除
    int deleteMoreByArrayOne(@Param("eids") Integer[] eids);

    int deleteMoreByArrayTwo(@Param("eids") Integer[] eids);

    // 通过list集合实现批量添加的功能
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
