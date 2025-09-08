package com.jhe.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhe.memories_back.common.entity.ConcentrationTestEntity;
import com.jhe.memories_back.common.entity.pk.ConcentrationTestPk;

public interface ConcentrationTestRepository extends JpaRepository<ConcentrationTestEntity, ConcentrationTestPk>{
    
}
