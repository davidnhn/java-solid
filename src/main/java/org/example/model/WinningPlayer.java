package org.example.model;

public class WinningPlayer implements IPlayer{

    IPlayer winner;

    public WinningPlayer(IPlayer player) {
        this.winner = player;
    }

    @Override
    public PlayingCard getCard(int index) {
        return winner.getCard(index);
    }

    @Override
    public PlayingCard removeCard() {
       return  winner.removeCard();
            }

    @Override
    public void addCardToHand(PlayingCard pc) {
        winner.addCardToHand(pc);
    }

    @Override
    public String getName() {
        return "*****" + winner.getName() + "******";
    }
}

// Le design pattern Decorateur prend l'objet qu'on veut decorer en parametre de son constructeur pour l'instancier ,
// implemente le meme contrat d'interface (IPlayer), donc possede les meme methodes , et modifie une methode (getName ici).