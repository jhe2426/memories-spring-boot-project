package com.jhe.memories_back.common.dto.request.openai;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetWayRequestDto {
    @NotBlank
    @Pattern(regexp="^(기억력|집중력)$")
    private String type;
}
