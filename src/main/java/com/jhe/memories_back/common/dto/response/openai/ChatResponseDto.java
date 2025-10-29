package com.jhe.memories_back.common.dto.response.openai;

import java.util.List;

import com.jhe.memories_back.common.vo.GptChoiceVO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatResponseDto {
    private List<GptChoiceVO> choices;
}
