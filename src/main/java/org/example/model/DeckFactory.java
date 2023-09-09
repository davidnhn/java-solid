package org.example.model;

public class DeckFactory {
    public enum DeckType {
        Normal,
        Small,
        Test
    }

    public static Deck makeDeck(DeckType type) {
        switch (type) {
            case Normal : return new NormalDeck();
            case Test : return new TestDeck();
            case Small: return new SmallDeck();
        }
        return new NormalDeck();
    }
}
