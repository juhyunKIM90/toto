package com.example.toto.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ABoardController {

    private List<String> posts = new ArrayList<>();


    @RequestMapping("/cboard/list")
    public String post(String content) {
        posts.add(content);
        return "cboard/cboard2"; // cboard/cboard2.html 이동이 된다.
    }

    @RequestMapping("/cboard/writeForm")
    public String writeForm() {
        return "cboard/write";
        }
}