package com.example.old;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuizController {

    Quiz quiz;
    QuizView view;

    public void startQuiz() {
        view.displayQuestion(quiz.getQuestion());
        boolean isCorrectAnswer = view.getUserAnswer().equalsIgnoreCase(quiz.getAnswer());

        view.displayResult(isCorrectAnswer);
    }
}
