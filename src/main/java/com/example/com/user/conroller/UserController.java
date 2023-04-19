package com.example.com.user.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
    
    @RequestMapping("/List")
    public String list() {
        return "user/list";
    }
    
}
