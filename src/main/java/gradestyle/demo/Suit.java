package gradestyle.demo;

import gradestyle.demo.Util.Utils.NotFoundException;

public enum Suit {
  Hearts,
  Diamonds,
  Spades,
  Clubs;

  private Suit() {}

  /**
   * Find the suit from the names of the suit, provided as a string.
   *
   *  @throws NotFoundException if there is no suit with the given name
   *  @param name
   *  @return the suit instance
   */
  public static Suit getSuit(String name) throws NotFoundException {
    for (Suit suit : Suit.values()) {
      if (suit.name().strip().compareToIgnoreCase(name.strip()) == 0l) {
        return suit;
      }
    }

    throw new NotFoundException("Could not find suit with name " + name);
  }

  /**
   * Get a printable character for the suit.
   * 
   * <p> The characters are as follows:
   * <ul>
   *   <li> ♥ - Hearts
   *   <li> ♦ - Diamonds
   *   <li> ♠ - Spades
   *   <li> ♣ - Clubs
   * </ul>
   */
  public char getPrintableSuit() {
    // initalise a character variable
    // that will be returned at the
    // end of the method
    char character = '?';

    // determine character based on suit
    switch (this) {
      case Hearts:
        // return the heart unicode character
        // for the suit of hearts
        character = '\u2665';
        break;
      case Diamonds:
        // return the diamond unicode character
        // for the suit of diamonds
        character = '\u2666';
        break;
      case Spades:
        // return the spade unicode character
        // for the suit of spades
        character = '\u2660';
        break;
      case Clubs:
        // return the club unicode character
        // for the suit of clubs
        character = '\u2663';
      default:
        // This should never happen
        // as the switch is exhausive.
    }

    return character;
  }
}
