package com.example.kidsapp;

public class ScienceQuestions {

    public String mQuestions[] = {
            "Which is the hottest season of the year?",
            "Leaves start to change color during which season?",
            "Which item is nonliving?",
            "What planet do we live on?",
            "What is the main job of the lungs?",
            "Which animal lays eggs?",
            "The two holes of the nose are called?",
            "Legs have feet and arms have ?",
            "Which organ covers the entire body and protects it?",
    };

    private String mChoices[][] = {
            {"Winter", "Spring", "Summer", "Fall"},
            {"Spring", "Fall", "Summer", "Winter"},
            {"Rock", "Dog", "Flower", "Butterfly"},
            {"Mercury", "Venus", "Earth", "Saturn"},
            {"Thinking", "Breathing", "Digesting Food", "Seeing"},
            {"Dog", "Cat", "Duck", "Sheep"},
            {"Eyelids", "Nostrils", "Nails", "Hair"},
            {"Ankles", "Knees", "Toes", "Hands"},
            {"Liver", "Heart,", "Skin", "Brain"},

    };

    private String mCorrectAnswers[] = {
            "Summer",
            "Fall",
            "Rock",
            "Earth",
            "Breathing",
            "Duck",
            "Nostrils",
            "Hands",
            "Skin"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    };

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    };

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    };

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    };

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    };

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

