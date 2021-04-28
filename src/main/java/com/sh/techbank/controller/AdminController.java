package com.sh.techbank.controller;


import com.sh.techbank.domain.AgendaForm;
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

    @GetMapping("/board.do")
    public String agendaInsertForm() {


        return "board_write";
    }


    @PostMapping("/board.pro")
    public String agendaInsert(AgendaForm agendaForm) {

        System.out.println(agendaForm.getAgendaNumber());
        System.out.println(agendaForm.getAgendaName());
        System.out.println(agendaForm.getAgendaPlace());
        System.out.println(agendaForm.getAgendaStartDate());
        System.out.println(agendaForm.getAgendaEndDate());
        System.out.println(agendaForm.getAgendaEndDate());
        System.out.println(agendaForm.getAgendaSkill());
        System.out.println(agendaForm.getAgendaCategory());
        System.out.println(agendaForm.getAgendaInterviewNumber());

        return "";
    }

    public String agendaInsertComplete() {

        return "";
    }

}
