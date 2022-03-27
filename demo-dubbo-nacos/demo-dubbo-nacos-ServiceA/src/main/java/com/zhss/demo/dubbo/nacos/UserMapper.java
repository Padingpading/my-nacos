package com.zhss.demo.dubbo.nacos;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name) VALUES(#{name})")
    void insert(User user);

}
