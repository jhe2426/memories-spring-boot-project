package com.jhe.memories_back.common.entity;

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
}
