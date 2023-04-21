package com.example.com.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.com.menu.service.MenuService;
import com.example.com.menu.vo.MenuVo;

@Controller
@RequestMapping("/Menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/List")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        List<MenuVo> menuList = menuService.getMenuList();
        mv.setViewName("user/list");
        mv.addObject("menuList", menuList);
        return mv;
    }
    
}
