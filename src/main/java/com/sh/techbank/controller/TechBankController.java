package com.sh.techbank.controller;


import com.sh.techbank.domain.BoardVO;
import com.sh.techbank.entity.Board;
import com.sh.techbank.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TechBankController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/login.do")
    public String login() { return "login"; }
    
    // 안건 등록 페이지 이동
    @GetMapping("/write.do")
    public String boardWrite() { return "board_write"; }

    @PostMapping("/write_pro.do")
    public String boardWritePro(BoardVO vo) {

        System.out.println("BoardPro");
        System.out.println(vo.toString());

        // vo를 Enitity로 변환
        Board board = vo.toEntity();
        System.out.println(board.toString());

        // Repositoy에게 Entity를 DB안에 저장하게 한다.
        Board saved = boardRepository.save(board);
        System.out.println(saved.toString());
        return "";

    }
}
