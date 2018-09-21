package com.example.springbootdemo.mapper;

import com.example.springbootdemo.data.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}