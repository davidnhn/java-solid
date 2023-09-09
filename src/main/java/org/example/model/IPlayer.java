package org.example.model;

public interface IPlayer {

    public PlayingCard getCard(int index) ;

    public PlayingCard removeCard() ;

    public void addCardToHand(PlayingCard pc) ;

    public String getName();


}
