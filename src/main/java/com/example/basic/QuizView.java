package com.example.basic;

import java.util.Scanner;

public class QuizView {

    public void displayQuestion(String question){
        System.out.println(question);
    }

    public String getUserAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String userAnswer = sc.next();
        System.out.println("choice: " + userAnswer);
        sc.close();
        return userAnswer;
    }

    public void displayResult(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("정답입니다!");
        } else System.out.println("오답입니다.");

    }
}
