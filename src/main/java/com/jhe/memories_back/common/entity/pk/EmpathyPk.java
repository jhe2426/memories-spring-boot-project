package com.jhe.memories_back.common.entity.pk;

import java.io.Serializable;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpathyPk implements Serializable {
    @Column(name="user_id")
    private String userId;
    @Column(name="diary_number")
    private Integer diaryNumber;    
}
