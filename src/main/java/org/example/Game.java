package org.example;

import org.example.controller.GameController;
import org.example.games.HighCardGameEvaluator;
import org.example.model.Deck;
import org.example.model.DeckFactory;
import org.example.views.CommandLineView;
import org.example.views.GameSwingView;

public class Game {
    public static void main(String args[]) {
        GameSwingView gsv = new GameSwingView();
        gsv.createAndShowGUI();
        // GameController gc = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());
//        GameController gc = new GameController(new Deck(), gsv, new HighCardGameEvaluator());
      GameController gc = new GameController(DeckFactory.makeDeck(DeckFactory.DeckType.Normal), gsv, new HighCardGameEvaluator());

        gc.run();
    }
}


