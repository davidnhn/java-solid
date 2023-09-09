package org.example.games;

import org.example.model.IPlayer;

import java.util.List;

public interface GameEvaluator {

    public IPlayer evaluateWinner(List<IPlayer> players);
}
