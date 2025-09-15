package com.jhe.memories_back.common.entity;

import com.jhe.memories_back.common.dto.request.auth.SignUpRequestDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="user")
@Table(name="user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    
    @Id
    private String userId;
    private String userPassword;
    private String joinType;
    private String snsId;
    private String name;
    private String address;
    private String detailAddress;
    private String profileImage;
    private String gender;
    private Integer age;

    public UserEntity(SignUpRequestDto dto, String encodedPassword) {
        this.userId = dto.getUserId();
        this.userPassword = encodedPassword;
        this.name = dto.getName();
        this.address = dto.getAddress();
        this.detailAddress = dto.getDetailAddress();
        this.joinType = dto.getJoinType();
        this.snsId = dto.getSnsId();
    }
}
