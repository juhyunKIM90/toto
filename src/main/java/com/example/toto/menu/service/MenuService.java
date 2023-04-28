package com.example.toto.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toto.menu.mapper.MenuMapper;
import com.example.toto.menu.vo.MenuVo;

@Service("menuService")
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;

    public List<MenuVo> getMenuList() {
        return menuMapper.getMenuList();
    }

    public void insertMenu(MenuVo menuVo) {
        menuMapper.insertMenu(menuVo);
    }

}
