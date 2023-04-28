package com.example.toto.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toto.board.mapper.BoardMapper;
import com.example.toto.board.vo.BoardVo;

@Service("boardService")
public class BoardService {
    @Autowired
    private BoardMapper BoardMappber;

    public List<BoardVo> getBoardList() {
        List<BoardVo> boardList = BoardMappber.getBoardList();
        return boardList;
    }

}
