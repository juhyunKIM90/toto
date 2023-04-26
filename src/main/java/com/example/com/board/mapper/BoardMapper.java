package com.example.com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.com.board.vo.BoardVo;

@Repository
@Mapper
public interface BoardMapper {

    List<BoardVo> getBoardList();

}
