package org.example;

import org.example.controller.GameController;
import org.example.games.HighCardGameEvaluator;
import org.example.model.DeckFactory;
import org.example.views.GameSwingPassingViews;
import org.example.views.GameSwingView;
import org.example.views.GameViewables;

public class Game {
    public static void main(String args[]) {
        GameViewables views = new GameViewables();
        GameSwingView gsv = new GameSwingView();
        gsv.createAndShowGUI();
        views.addViewable(gsv);

        for (int i = 0; i < 3; i++) {
            GameSwingPassingViews passingView = new GameSwingPassingViews();
            passingView.createAndShowGUI();

            views.addViewable(passingView);

            try {
                Thread.sleep(2500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // GameController gc = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());
//        GameController gc = new GameController(new Deck(), gsv, new HighCardGameEvaluator());
//      GameController gc = new GameController(DeckFactory.makeDeck(DeckFactory.DeckType.Normal), gsv, new HighCardGameEvaluator());
      GameController gc = new GameController(DeckFactory.makeDeck(DeckFactory.DeckType.Normal), views, new HighCardGameEvaluator());

        gc.run();
    }
}


