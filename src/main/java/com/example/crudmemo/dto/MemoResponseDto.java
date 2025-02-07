package com.example.crudmemo.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class MemoResponseDto {

    private final Long id;
    private final String content;

    public MemoResponseDto(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
