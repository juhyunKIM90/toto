package com.example.toto.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.toto.board.service.BoardService;
import com.example.toto.board.vo.BoardVo;

@Controller
//@RequestMapping("/Board")
public class BoardController {
    @Autowired
    private BoardService boardService;
    //private MenuService  menuService;
    
    @RequestMapping("/Board/List")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();

        // 메뉴
        //List<MenuVo> menuList = menuService.getMenuList();
        //System.out.println(menuList);


        // BoardList - 게시글 목록
        List<BoardVo> boardList = boardService.getBoardList();

        mv.setViewName("board/list");
        mv.addObject("boardList", boardList);
        //mv.addObject("menuList", menuList);
        //System.out.println("nope" + menuList);
        return mv;
    }
    
    @RequestMapping("/Board/WriteForm")
    public ModelAndView writeform(BoardVo boardVo) {
        ModelAndView mv = new ModelAndView("board/write");
        // 답글처리해야함

        return mv;
    }
    
    @RequestMapping("/Board/Write")
    public ModelAndView write(BoardVo boardVo) {
        ModelAndView mv = new ModelAndView("redirect:/Board/List");
        
        // 게시글 등록
        boardService.insertBoard(boardVo);
        
        return mv;
    }

    @RequestMapping("/Board/View")
    public ModelAndView view(String idx) {
        ModelAndView mv = new ModelAndView("board/view");
        BoardVo boardVo = boardService.getBoard( idx );
        System.out.println("받은보드" + boardVo);
        mv.addObject("boardVo", boardVo);
        return mv;
    }


}
