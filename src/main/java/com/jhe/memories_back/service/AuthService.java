package com.jhe.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.jhe.memories_back.common.dto.request.auth.IdCheckRequestDto;
import com.jhe.memories_back.common.dto.response.ResponseDto;

public interface AuthService {
    ResponseEntity<ResponseDto> idCheck(IdCheckRequestDto dto);
}
