package com.example.com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.com.board.mapper.BoardMapper;
import com.example.com.board.vo.BoardVo;

@Service("boardService")
public class BoardService {
    @Autowired
    private BoardMapper BoardMappber;

    public List<BoardVo> getBoardList() {
        List<BoardVo> boardList = BoardMappber.getBoardList();
        return boardList;
    }

}
