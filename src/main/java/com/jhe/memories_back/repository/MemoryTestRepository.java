package com.jhe.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhe.memories_back.common.entity.MemoryTestEntity;
import com.jhe.memories_back.common.entity.pk.MemoryTestPk;

public interface MemoryTestRepository extends JpaRepository<MemoryTestEntity, MemoryTestPk> {
    
}
