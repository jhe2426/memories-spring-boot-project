package com.jhe.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jhe.memories_back.common.dto.request.diary.PostDiaryRquestDto;
import com.jhe.memories_back.common.dto.response.ResponseDto;

public interface DiaryService {
    ResponseEntity<ResponseDto> postDiary(PostDiaryRquestDto dto, String userId);
}
