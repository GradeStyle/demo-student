package gradestyle.demo;

import static gradestyle.demo.Util.Utils.text;
import java.util.List;
import java.lang.String;

/** A card in a blackjack game, with a suit and rank. */
public class BJCard {
  public BJCard(BJRank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public gradestyle.demo.BJRank rank;
  public gradestyle.demo.Suit suit;

  private int unused;

  public BJRank getRank() {
    return rank; // return the rank
  }

  public Suit getSuit() {
    return suit;
  }

  private static char[][] image = new char[][] {
      "\u250c\u2500\u2500\u2500\u2500\u2500\u2510".toCharArray(),
      "\u2502?    \u2502".toCharArray(),
      "\u2502  *  \u2502".toCharArray(),
      "\u2502    ?\u2502".toCharArray(),
      "\u2514\u2500\u2500\u2500\u2500\u2500\u2518".toCharArray()
  };

  @Override
  /**
   * Create a printable version of the card.
   */
  public String toString() {
    // replace the asterisk with the suit
    image[2][3] = suit.getPrintableSuit();

    if (rank == BJRank.Ten)
    {
      // top left corner
      image[1][1] = text(1);
      image[1][2] = text(0);

      // bottom right corner
      image[3][4]=text(1);
      image[3][5]=text(0);
    }
      else
    {
      // clean the template, potentially a 10 was printed last
      image[1][2] = ' ';
      image[3][4] = ' ';

      // replace the question marks with the rank
      image[1][1] = rank.getPrintableBJRank();
      image[3][5] = rank.getPrintableBJRank();
    }

    String result = "";

    for (char[] line : image) {
      result += new String(line) + "\012";
    }

    return result;
  }
}
