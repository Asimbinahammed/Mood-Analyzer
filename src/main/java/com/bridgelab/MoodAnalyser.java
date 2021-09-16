/*
@author-Asim Ahammed
 */

package com.bridgelab;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}

//exception class
class MoodAnalyserException extends Exception{
    public MoodAnalyserException(String message){
        super(message);
    }
}