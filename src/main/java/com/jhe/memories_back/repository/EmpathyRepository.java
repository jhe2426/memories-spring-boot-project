package com.jhe.memories_back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhe.memories_back.common.entity.EmpathyEntity;
import com.jhe.memories_back.common.entity.pk.EmpathyPk;

@Repository
public interface EmpathyRepository extends JpaRepository<EmpathyEntity, EmpathyPk> {
    
    EmpathyEntity findByUserIdAndDiaryNumber(String userId, Integer diaryNumber);
    List<EmpathyEntity> findByDiaryNumber(Integer diaryNumber);

}
