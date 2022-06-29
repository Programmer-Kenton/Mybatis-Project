package com.kenton;

import com.kenton.mybatis.mapper.DynamicSQLMapper;
import com.kenton.mybatis.pojo.Emp;
import com.kenton.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Kenton
 * @description 标签测试类
 * @date: 2022/6/20 20:32
 */
public class ResultMapTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "王五", 12, '男', "123@qq.com"));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "张三", 23, '男', null));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMoreByArrayOne(new Integer[]{6, 7, 8});
        System.out.println(result);
    }

    @Test
    public void testInsertMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null,"a1",23, '男',"123qq.com");
        Emp emp2 = new Emp(null,"a2",23, '男',"123qq.com");
        Emp emp3 = new Emp(null,"a3",23, '男',"123qq.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        System.out.println(mapper.insertMoreByList(emps));
    }
}
