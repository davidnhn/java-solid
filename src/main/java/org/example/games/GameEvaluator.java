package org.example.games;

import org.example.model.Player;
import org.example.model.PlayingCard;

import java.util.List;

public interface GameEvaluator {

    public Player evaluateWinner(List<Player> players);
}
