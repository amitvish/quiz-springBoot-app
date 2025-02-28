package com.agent.quizapp.dao;

import com.agent.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    @Query(value = "SELECT q FROM Question q WHERE LOWER(q.category) = LOWER(:category)", nativeQuery = true)
    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM Question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionByCategory(String category, int numQ);
}
