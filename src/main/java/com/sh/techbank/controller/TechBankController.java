package com.sh.techbank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TechBankController {

    @GetMapping("/login.do")
    public String login() { return "login"; }
    
    // 안건 등록 페이지 이동
    @GetMapping("/boardwrite.do")
    public String boardWrite() { return "board_write"; }
}
