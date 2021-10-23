package model.rules;

import model.Card;
import model.Dealer;
import model.Deck;
import model.Player;


//Requirement 6
//The code for getting a card from the deck, show the card and give it to a player is
//duplicated in a number of places. Make a refactoring to remove this duplication and
//that supports low coupling/high cohesion (i.e. check how you can evaluate different
//solutions to the problem and select the one that gives the best result according to low
//coupling/high cohesion). The code that is duplicated is similar to this:
//Card c = deck.GetCard();
class AmericanNewGameStrategy implements NewGameStrategy {

  public boolean newGame(Deck deck, Dealer dealer, Player player) {
    Card.Mutable c;

    c = deck.getCard();
    c.show(true);
    player.dealCard(c);

    c = deck.getCard();
    c.show(true);
    dealer.dealCard(c);

    c = deck.getCard();
    c.show(true);
    player.dealCard(c);

    c = deck.getCard();
    c.show(false);
    dealer.dealCard(c);

    return true;
  }
}