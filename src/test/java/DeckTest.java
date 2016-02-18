import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DeckTest {

  @Test
  public void deck_initializesCorrectly() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }

  @Test
  public void getCards_initializesWithCardsList_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck.getCards() instanceof ArrayList);
  }

  @Test
  public void getCards_initalizesWith52Cards_52() {
    Deck testDeck = new Deck();
    assertEquals(52, testDeck.getCards().size());
  }

  @Test
  public void getCards_cardsAreInitializedWIthSuitsAndValues_AceOfSpades() {
    Deck testDeck = new Deck();
    assertEquals(52, testDeck.getCards().size());
  }

  @Test
  public void getCards_deckContains52UniqueCards_kingOfDiamonds() {
    Deck testDeck = new Deck();
    Card kingOfDiamonds = testDeck.getCards().get(51);
    assertEquals("King of Diamonds", kingOfDiamonds.name());
  }
}
