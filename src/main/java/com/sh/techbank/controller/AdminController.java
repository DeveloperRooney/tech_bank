package com.sh.techbank.controller;


import com.sh.techbank.domain.AgendaForm;
import com.sh.techbank.entity.Agenda;
import com.sh.techbank.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private AgendaRepository agendaRepository;

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

        System.out.println(agendaForm.toString());


        // VO를 Entity로 변환
        Agenda agenda = agendaForm.toEntity();
        System.out.println(agenda.toString());

        // Repository를 이용하여 Entity를 DB에 저장
        Agenda saved = agendaRepository.save(agenda);
        System.out.println(saved.toString());

        return "";
    }

    public String agendaInsertComplete() {

        return "";
    }

}
