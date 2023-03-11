package com.onboarding.onboardingProject.repository;

import com.onboarding.onboardingProject.model.Rubbish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubbishRepository extends JpaRepository<Rubbish,Integer> {
    @Query(value = "select * from rubbish r where r.waste_item like %:keyword%", nativeQuery = true)
    List<Rubbish> search(@Param("keyword") String keyword);
}
