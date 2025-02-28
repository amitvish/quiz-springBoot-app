package com.agent.quizapp.dao;

import com.agent.quizapp.model.Question;
import com.agent.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
