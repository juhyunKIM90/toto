package com.example.com.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.menu.mapper.MenuMapper;
import com.example.com.menu.vo.MenuVo;

@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;

    public List<MenuVo> getMenuList() {
        return menuMapper.getMenuList();
    }

}
