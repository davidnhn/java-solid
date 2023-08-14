package org.example;

import org.example.controller.GameController;
import org.example.games.HighCardGameEvaluator;
import org.example.model.Deck;
import org.example.views.View;

public class Game {
    public static void main(String args[]) {
        GameController gc = new GameController(new Deck(), new View(), new HighCardGameEvaluator());
        gc.run();
    }
}


