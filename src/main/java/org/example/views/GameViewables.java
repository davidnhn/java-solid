package org.example.views;

import org.example.controller.GameController;

import java.util.ArrayList;
import java.util.List;

public class GameViewables implements GameViewable {

    List<GameViewable> views;

    public GameViewables () {
        views = new ArrayList<GameViewable>();
    }

    public void addViewable (GameViewable view) {
        views.add(view);
    }
    @Override
    public void setController(GameController gc) {
    for (GameViewable view : views) {
        view.setController(gc);
    }
    }

    @Override
    public void promptForPlayerName() {
        for (GameViewable view : views) {
            view.promptForPlayerName();
        }
    }

    @Override
    public void showPlayerName(int playerIndex, String playerName) {
        for (GameViewable view : views) {
            view.showPlayerName(playerIndex, playerName);
        }
    }

    @Override
    public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
        for (GameViewable view : views) {
            view.showPlayerName(playerIndex, playerName);
        }
    }

    @Override
    public void promptForFlip() {
        for (GameViewable view : views) {
            view.promptForFlip();
        }
    }

    @Override
    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        for (GameViewable view : views) {
            view.showCardForPlayer(playerIndex, playerName, rank, suit);
        }
    }

    @Override
    public void showWinner(String winnerName) {
        for (GameViewable view : views) {
            view.showWinner(winnerName);
        }
    }

    @Override
    public void promptForNewGame() {
        for (GameViewable view : views) {
            view.promptForNewGame();
        }
    }
}

// Le design pattern composite permet de gerer une collection d'un meme objet, il faut que la classe implemente la meme interface que l'objet