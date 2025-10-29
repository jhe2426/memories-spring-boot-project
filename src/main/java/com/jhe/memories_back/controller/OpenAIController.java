package com.jhe.memories_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhe.memories_back.service.OpenAIService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/open-ai")
@RequiredArgsConstructor
public class OpenAIController {

    private final OpenAIService openAIService;

    @GetMapping("") 
    public String chat() {
        return openAIService.chat();
    }
    
}
