package com.ecps.seckill.mapper;

import com.ecps.seckill.pojo.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer employeeId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}