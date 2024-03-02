package com.zhai.mapper;

import com.zhai.entity.FlightEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlightMapper {
    /**
     * 查询
     * 1.查询所有
     * 2.根据条件查询
     * 3.动态查询方式
     */
//    查询所有数据
    List<FlightEntity> getByFlightAll();
//    根据id进行查询

    FlightEntity getByIdFlight(Integer id);
    /**
     * 插入数据的结果 如果影响行数 大于0 成功的  否则 就是失败的
     *
     */
    int insertFlight(FlightEntity flightEntity);
    //删除
    int deleteByIdFlight(Integer id);
//    修改
    int updateFlight(FlightEntity flightEntity);
//    多条件查询
List<FlightEntity> getByIdFlightPoJo(FlightEntity flightEntity);
}
