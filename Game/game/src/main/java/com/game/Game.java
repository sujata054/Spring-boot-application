package com.game;

import java.util.Random;


public class Game {
    private String heading;
    private Integer randomNo ;
    private Integer guessPlayer;
    public Game() {
        this.heading = "Guess a number between 1-10";
    Random rand = new Random();
    randomNo = rand.nextInt(10)+1;
    System.out.println("Guess a Number between 1-10");
    
}


public String getHeading() {
    return heading;
}
public void setHeading(String heading) {
    this.heading = heading;
}
    public Integer getRandomNo() {
        return randomNo;
    }
    public void setRandomNo(Integer randomNo) {
        this.randomNo = randomNo;
    }
    public Integer getguessPlayer() {
        return guessPlayer;
    }
    public void setguessPlayer(Integer guessPlayer) {
        this.guessPlayer = guessPlayer;
    }
    
}
