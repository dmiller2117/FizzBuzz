package com.davidmiller;

public class GameRunner{

    private Game game;

    GameRunner(Game game){
        this.game = game;
    }

    public void run() {
        for (int i = 1; i <=100 ; i++) {
            String gameValue = game.play(i);
            System.out.println(gameValue);
        }
    }
}