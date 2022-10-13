package gradestyle.demo;
import gradestyle.demo.Util.Utils;
import gradestyle.demo.Util.Utils.NotFoundException;
public enum BJRank {
  Ace(11),
  Two(2),
  Three(3),
  Four(4),
  Five(5),
  Six(6),
  Seven(7),
  Eight(8),
  Nine(9),
  Ten(10),
  Jack(10),
  Queen(10),
  King(10);

  int value;



  /**
   * Get the rank character for a card.
   *
   * <p>The characters are as follows:
   * <ul>
   *   <li> A - Ace
   *   <li> J - Jack
   *   <li> Q - Queen
   *   <li> K - King
   *   <li> 2-10 - The number
   *
   * @return the rank character
   */
  public char getPrintableBJRank() {
    switch (this) {
      case Ace:
        return 'A';
      case Jack:
        return 'J';
      case Queen:
        return 'Q';
      case King:
        return 'K';
      default:
        return Utils.text(value);
    }
  }

  private BJRank(int value) {
    this.value = value;
  }



  /**
   * Get the rank
   * @param name the name
   *   of the rank
     @param test not used
   * @return the rank
   */
  public static BJRank getRank(String name) throws NotFoundException {
    for (BJRank rank : values()) {
      if (rank.name().strip().compareToIgnoreCase(name.strip()) == 0) {
        return rank;
      }
    }

    throw new NotFoundException("Could not find rank with name " + name);
  }
}
