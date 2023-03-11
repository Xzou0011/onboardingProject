package com.onboarding.onboardingProject.repository;

import com.onboarding.onboardingProject.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {

    @Query(value = "select * from article a where a.category like %:keyword%", nativeQuery = true)
    List<Article> search(@Param("keyword") String keyword);

}
