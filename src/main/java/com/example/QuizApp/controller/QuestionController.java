package com.example.QuizApp.controller;

import com.example.QuizApp.Question;
import com.example.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }
    @PostMapping("/addQuestion")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestions(question);

    }
    @PutMapping("/updateQuestion")
    public String updateQuestion(@RequestBody Question question){
        return questionService.updateQuestions(question);

    }
    @DeleteMapping
    public String deleteQuestion(@RequestBody Question question){
        return questionService.deleteQuestions(question);
    }


}
