package com.example.toto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        // return "home";
        //return "develmap"; // 작업 편하라고 바로가기 느낌? 사이트경로(후에 사이트맵으로 사용해도되고)
        return "home_start";
    }
    
   @GetMapping("/home")
   public String homepage(){
    return "home";
   }
   @GetMapping("/loginpage")
   public String loginpage(){

    return "loginpage";
   }

   @GetMapping("/login")
   public String login(){

    return "login";
   }

   @GetMapping("/hello")
	public String hello() {
		return "hello";
	}

   @RequestMapping("/userlist")
   public String userlist(){

    return "/user/list";
   }

   @RequestMapping("/fuck")
   public String fuck() {
    return "develmap";
   }

   @RequestMapping("/wow")
   public String wow() {
    return "wow";
   }
   
}
