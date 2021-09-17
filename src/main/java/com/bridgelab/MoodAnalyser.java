/*
@author-Asim Ahammed
 */

package com.bridgelab;

public class MoodAnalyser {
    private String message;

    public  MoodAnalyser(){
    //default constructor
    }

    public MoodAnalyser(String message){
        this.message=message; //parameter constructor
    }

    public String analyseMood(String message) {
        if (message.isEmpty()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
}

//exception class
class MoodAnalyserException extends Exception{
    public MoodAnalyserException(String message){
        super(message);
    }
}