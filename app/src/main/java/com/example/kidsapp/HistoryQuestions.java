package com.example.kidsapp;

public class HistoryQuestions {
    public String mQuestions[] = {
            "Who was the first president of the United States?",
            "The war that the colonists gained their independence was called the",
            "What is another name for the Fourth of July?",
            "What was the large animal that lived on the prairies and provided fresh meat for the pioneers?",
            "Who set out to explore and chart the territory acquired in the Louisiana Purchase?",
            "The colonists revolted and dumped   ?   into the Boston Harbor.",
            "Who is famous for his midnight ride warning of the imminent arrival of the British army?",
            "What is our country's national anthem?",
            "The Declaration of Independence was signed in:",
    };

    private String mChoices[][] = {
            {"Abraham Lincoln", "George Washington", "Thomas Jeffereson", "John Adams"},
            {"American Revolution", "Civil War", "World War 1", "War of 1812"},
            {"Flag Day", "Labor Day", "Independence Day", "Liberty Bell Day"},
            {"Deer", "Horse", "Duck", "Bison"},
            {"Lewis and Clark", "Tim and John", "Peter and Frank", "Thomas and Charles"},
            {"Oil", "Sugar", "Tea", "Gold"},
            {"John Hancock", "George Washington", "Paul Revere", "Thomas Jefferson"},
            {"God Bless America", "Star Spangled Banner", "O Canada", "God Save the Queen"},
            {"1789", "1801,", "1776", "1793"},

    };

    private String mCorrectAnswers[] = {
            "George Washington",
            "American Revolution",
            "Independence Day",
            "Bison",
            "Lewis and Clark",
            "Tea",
            "Paul Revere",
            "Star Spangled Banner",
            "1776"
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
