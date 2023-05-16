package com.example.toto;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.toto.user.service.UserService;
import com.example.toto.user.vo.UserVo;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

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
   @PostMapping("/loginthe")
   public ModelAndView loginthe(
            @RequestParam Map<String, Object>map ,HttpSession session
        ){
    ModelAndView mv = new ModelAndView();
    System.out.println("userid:" + map.get("userid"));
    System.out.println("passwd:" + map.get("passwd"));

    UserVo user = userService.getUserLog(map);
    // UserVo  user = userService.getUser( map.get("userid") );  

    System.out.println("유저:" + user);
    if(user != null){
        session.setAttribute("user", user);
        mv.setViewName("redirect:/home");
    } else {
        mv.setViewName("loginpage");
    }

    return mv;
   }
   @RequestMapping("/logout")
   public String logout(HttpSession session) {
    session.invalidate();
    return "redirect:/home";
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
