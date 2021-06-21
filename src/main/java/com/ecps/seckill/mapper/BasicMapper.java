package com.ecps.seckill.mapper;

import com.ecps.seckill.pojo.Basic;

public interface BasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Basic record);

    int insertSelective(Basic record);

    Basic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Basic record);

    int updateByPrimaryKey(Basic record);
}