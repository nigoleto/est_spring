package com.example.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {


    public static void main(String[] args) {

        Quiz quiz = new Quiz("현창님은 펠리컨한테 잡아먹혔다?","맞다");
        QuizView quizView = new QuizView();
        QuizController quizController = new QuizController(quiz, quizView);

        quizController.startQuiz();


//		SpringApplication.run(BasicApplication.class, args);
    }

}
