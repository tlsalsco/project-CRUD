package com.sparta.boardcurd.respository;

import com.sparta.boardcurd.dto.BoardListResponseDto;
import com.sparta.boardcurd.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}
