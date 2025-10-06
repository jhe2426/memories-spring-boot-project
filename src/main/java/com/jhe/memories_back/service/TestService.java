package com.jhe.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jhe.memories_back.common.dto.request.test.PostMemoryRequestDto;
import com.jhe.memories_back.common.dto.response.ResponseDto;

public interface TestService {
    ResponseEntity<ResponseDto> postMemory(PostMemoryRequestDto dto, String userId);
}
