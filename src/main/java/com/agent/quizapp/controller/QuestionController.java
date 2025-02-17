package com.agent.quizapp.controller;


import com.agent.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping("allQuestions")
    public String getAllQuestions(){

        return questionService.getAllQuestions;
    }

}
