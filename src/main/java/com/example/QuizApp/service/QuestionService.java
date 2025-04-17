package com.example.QuizApp.service;

import com.example.QuizApp.Question;
import com.example.QuizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component(we can use either component or service)
@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestions(Question question) {
        questionDao.save(question);
        return "Successfully added";
    }

    public String updateQuestions(Question question) {
        questionDao.save(question);
        return "Successfully updated";
    }

    public String deleteQuestions(Question question) {
        questionDao.delete(question);
        return "Successfully deleted";
    }
}
