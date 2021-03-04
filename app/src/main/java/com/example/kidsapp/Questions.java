package com.example.kidsapp;

public class Questions {
    private int myTextId;


    //public Questions(int textId){
       // myTextId = textId;

   // }

    //public void setTextId(int textId) {
        //myTextId = textId;
    //}



    //public int getTextId() {
       // return myTextId;
    //}


    private String[] wordBank = new String[]{
            "Sister", "Above", "Found","Outside", "Another", "Because", "School", "Brothers","Thought", "Could", "Children",
            "Enough", "Wrong", "Whole", "Favorite", "Float", "Knew", "Little", "Listen","However", "People",
            "Really", "Again","Question", "Second", "Sometimes", "Talking", "Watch", "Answer", "Friends"
    };

    public String getWordBank(int index){
        String question = wordBank[index];
        return question;
    }
}
