package com.sh.techbank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/boardWrite.do")
    public String boardWrite() {
        return "board_write";
    }
}
