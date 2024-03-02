package com.zhai.service;

import com.zhai.entity.FlightEntity;
import com.zhai.mapper.FlightMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FlightService {
    private FlightMapper flightMapper;
    private SqlSession sqlSession; // SqlSession 注入
    public FlightService() throws IOException {
        // 通过无参构造方法 初始化mybatis 得到flightMapper
        // mybatis-config.xml 目录位置
        String resource = "mybatis-config.xml";
        // 1.解析mybatis-config.xml 得到数据库相关的配置信息
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //2.创建得到一个sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.获取到sqlSession
        this.sqlSession = sqlSessionFactory.openSession();
        flightMapper = sqlSession.getMapper(FlightMapper.class);
//        sqlSession.close();

    }
    //航班全部查询
        public List<FlightEntity> getByFlightAll() {
        return  flightMapper.getByFlightAll();
    }
    //根据id查询信息
        public FlightEntity getByIdFlight(Integer id) {
            return flightMapper.getByIdFlight(id);
    }
//    插入航班信息
    public int insertFlight(FlightEntity flightEntity) {
        int result = flightMapper.insertFlight(flightEntity);
        // 需要提交事务事务的
        sqlSession.commit();// 提交事务
        return result;
    }
    //删除航班信息
    public int deleteByIdFlight(Integer id) {
        int result = flightMapper.deleteByIdFlight(id);
        // 需要提交事务事务的  数据增加 update  删除
        sqlSession.commit();// 提交事务
        return result;
    }
//修改航班信息
    public int updateFlight(FlightEntity flightEntity) {
        int result = flightMapper.updateFlight(flightEntity);
        // 需要提交事务事务的  数据增加 update  删除
        sqlSession.commit();// 提交事务
        return result;
    }
//多条件查询
 public List<FlightEntity> getByIdFlightPoJo(FlightEntity flightEntity){
return flightMapper.getByIdFlightPoJo(flightEntity);
}
}
