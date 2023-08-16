package org.example.views;

import org.example.controller.GameController;

public interface GameViewable {
    void setController(GameController controller);

    void promptForPlayerName();

    void showPlayerName(int playerIndex, String name);

    void showFaceDownCardForPlayer(int playerIndex, String name);

    void promptForFlip();

    void showCardForPlayer(int playerIndex, String name, String rank, String suit);

    void showWinner (String winnerName);

    void promptForNewGame();


}
