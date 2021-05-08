package com.sh.techbank.controller;


import com.sh.techbank.domain.AgendaForm;
import com.sh.techbank.entity.Agenda;
import com.sh.techbank.entity.Member;
import com.sh.techbank.repository.AgendaRepository;
import com.sh.techbank.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class AdminController {

    AdminController(){}


    @Autowired
    private AgendaRepository agendaRepository;

    @Autowired
    private MemberRepository memberRepository;

    public String adminMain() {

        return "";
    }

    @GetMapping("/login.do")
    public String adminLoginForm() {

        return "login";
    }


    @PostMapping("/login.pro")
    public String adminLogin(String userid, String passwd, HttpSession session, RedirectAttributes redirectAttributes){

        System.out.println("입력받은 아이디 : " + userid);

        System.out.println("입력받은 비밀번호 : " + passwd);

        Member user = memberRepository.findByUserid(userid);

        if (user != null) {
            System.out.println("DB에 저장된 비밀번호 : " + user.getUserpwd());

            System.out.println(user);
        }

        if (user == null) {
            System.out.println("존재하지 않는 아이디");
            redirectAttributes.addAttribute("idnoexist", true);
        }else {
            if (user.getUserpwd().equals(passwd)) {
                System.out.println("로그인 실행");
                session.setAttribute("user", user);
            }else {
                System.out.println("비밀번호 불일치 실행");
                redirectAttributes.addAttribute("passfail", true);
            }
        }

        return "login_check";
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

        System.out.println("들어온 데이터 : " + agendaForm.toString());


        // VO를 Entity로 변환
        Agenda agenda = agendaForm.toEntity();
        System.out.println("Entity : " + agenda.toString());

        // Repository를 이용하여 Entity를 DB에 저장
        Agenda saved = agendaRepository.save(agenda);
        System.out.println("DB저장 : " + saved.toString());

        return "";
    }

    public String agendaInsertComplete() {

        return "";
    }

}
