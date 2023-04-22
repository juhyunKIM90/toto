package com.example.com.menu.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.com.menu.vo.MenuVo;

@Repository
@Mapper
public interface MenuMapper {

    List<MenuVo> getMenuList();

}
