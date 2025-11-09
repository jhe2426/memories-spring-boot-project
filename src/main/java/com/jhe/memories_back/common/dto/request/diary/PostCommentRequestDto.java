package com.jhe.memories_back.common.dto.request.diary;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostCommentRequestDto {
   @NotBlank
   private String comment; 
}
