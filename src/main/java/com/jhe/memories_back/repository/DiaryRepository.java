package com.jhe.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhe.memories_back.common.entity.DiaryEntity;

public interface DiaryRepository extends JpaRepository<DiaryEntity, Integer> {
    
}
