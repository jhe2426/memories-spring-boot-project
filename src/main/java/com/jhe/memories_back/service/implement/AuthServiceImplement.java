package com.jhe.memories_back.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jhe.memories_back.common.dto.request.auth.IdCheckRequestDto;
import com.jhe.memories_back.common.dto.response.ResponseDto;
import com.jhe.memories_back.repository.UserRepository;
import com.jhe.memories_back.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService{

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<ResponseDto> idCheck(IdCheckRequestDto dto) {
        
        try {
            
            String userId = dto.getUserId();
            boolean isExistUser = userRepository.existsById(userId);
            if (isExistUser) return ResponseDto.existUser();

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return ResponseDto.success(HttpStatus.OK);
    }
    
}
