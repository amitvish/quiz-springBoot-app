package com.agent.quizapp.controller;


import com.agent.quizapp.model.Question;
import com.agent.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        System.out.println("🔹 Controller received category: " + category);
        return questionService.getQuestionsByCategory(category);
    }

    @GetMapping("id/{id}")
    public Question getQuestionById(@PathVariable Integer id){
        return questionService.getQuestionById(id);
    }


    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }

    @DeleteMapping("remove/{id}")
    public String removeQuestion(@PathVariable Integer id){
        return questionService.removeQuestion(id);
    }
}
