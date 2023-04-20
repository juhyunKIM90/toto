package com.example.com.user.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.com.user.service.UserService;
import com.example.com.user.vo.UserVo;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping("/List")
    public ModelAndView list() {

        ModelAndView mv = new ModelAndView();

        List<UserVo> userList = userService.getUserList();

        mv.setViewName("user/List");
        mv.addObject("userList", userList);
        return mv;
    }
    
}
