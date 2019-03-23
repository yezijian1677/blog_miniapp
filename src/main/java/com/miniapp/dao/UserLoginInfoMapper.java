package com.miniapp.dao;

import com.miniapp.entity.UserLoginInfo;
import org.springframework.stereotype.Repository;

@Repository("userLoginInfoMapper")
public interface UserLoginInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoginInfo record);

    int insertSelective(UserLoginInfo record);

    UserLoginInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginInfo record);

    int updateByPrimaryKey(UserLoginInfo record);
}