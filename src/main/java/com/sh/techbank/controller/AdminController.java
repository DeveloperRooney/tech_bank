package com.sh.techbank.controller;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    AdminController(){}

    public String adminMain() {

        return "";
    }

    @GetMapping("/login.do")
    public String adminLoginForm() {

        return "login";
    }


    @PostMapping("/login.pro")
    public String adminLogin(String userid, String passwd, HttpSession session, RedirectAttributes redirectAttributes){

        System.out.println(userid);
        System.out.println(passwd);

        session.setAttribute("admin", "admin");

        return "";
    }

    public String adminLogout() {

        return "";
    }

    public String agendaInsertForm() {

        return "";
    }

    public String agendaInsert() {

        return "";
    }

    public String agendaInsertComplete() {

        return "";
    }

}
