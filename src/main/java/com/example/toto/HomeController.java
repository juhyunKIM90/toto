package com.example.toto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        // return "home";
        //return "develmap"; // 작업 편하라고 바로가기 느낌? 사이트경로(후에 사이트맵으로 사용해도되고)
        return "home_start";
    }
    
   @RequestMapping("/home")
   public String homepage(){
    return "home";
   }
   @RequestMapping("/loginpage")
   public String loginpage(){

    return "loginpage";
   }

   
}
