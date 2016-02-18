class Card {
  String mValue;
  String mSuit;

  public Card(String suit, String value) {
    mSuit = suit;
    mValue = value;
  }

  public String getSuit() {
    return mSuit;
  }

  public String getValue() {
    return mValue;
  }

  public String name() {
    return String.format("%s of %s", mValue, mSuit);
  }

}
