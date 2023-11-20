package com.Board.Board.service;

import com.Board.Board.entity.Board;
import com.Board.Board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board) {

        boardRepository.save(board);
    }
}
