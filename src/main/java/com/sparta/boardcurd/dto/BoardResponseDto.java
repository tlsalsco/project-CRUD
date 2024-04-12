package com.sparta.boardcurd.dto;

import com.sparta.boardcurd.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class BoardResponseDto {

    private String title;

    private String content;

    private LocalDateTime createdAt; //작성일시

    private LocalDateTime modifiedAt; //수정일시

    // board 의 정보를 받아 boardResponseDto 생성
    public BoardResponseDto(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
        this.createdAt = board.getModifiedAt();
        this.modifiedAt = board.getCreatedAt();
    }
}
