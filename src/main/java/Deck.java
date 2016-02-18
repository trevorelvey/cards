import java.util.ArrayList;

class Deck {
  private static final String [] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
  private static final String [] VALUES = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  private static ArrayList<Card> mCards;

  public Deck() {
    mCards = new ArrayList<Card>();
    for (String suit : SUITS) {
      for (String value : VALUES) {
        Card newCard = new Card(suit, value);
        mCards.add(newCard);
      }
    }
  }

  public static ArrayList<Card> getCards() {
    return mCards;
  }
}
