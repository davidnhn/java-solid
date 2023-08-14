package org.example.model;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        super();
        this.name = name;
        hand = new Hand();
    }

    public PlayingCard getCard(int index) {
        return hand.getCard(index);
    }

    public PlayingCard removeCard() {
        return hand.removeCard();
    }

    public void addCardToHand(PlayingCard removeTopCard) {
    }

    public String getName() {
        return name;
    }


}
