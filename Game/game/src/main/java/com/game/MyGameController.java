package com.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyGameController {

    private Player p = new Player();
   
    @PostMapping("/player")
    public void postName(@RequestParam String name) {
        p.setName(name);
    }

 
    @GetMapping("/player")
    public Player getPlayer() {
        return p;

    }
    
    private Game g = new Game();
    
   
     @PostMapping("/game")
     public String postGame() {
        return g.getHeading();
     }

    @GetMapping("/game")
    public Game getGame() {
        return g;
    }
 
    
    @PutMapping("/game")
    public void putguessPlayer(@RequestParam Integer guessPlayer) {
        g.setguessPlayer(guessPlayer);
        System.out.println("Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have  3 total moves to win the game");
        if (g.getguessPlayer() > g.getRandomNo()) {
            System.out.println("The number is lower, try again.");
           }
           else if (g.getguessPlayer() < g.getRandomNo()) {
            System.out.println("The number is higher, you can still try again.");
           } else  {
            System.out.println("correct! you win.");
           }
           g.setguessPlayer(guessPlayer);
    }

}
   

