package com.example.com.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.com.user.vo.UserVo;

@Repository
@Mapper
public interface UserMapper {

    List<UserVo> getUserList();

	void insertUser(UserVo userVo);

    UserVo getUser(String userid);

    void deleteUser(String userid);

}
