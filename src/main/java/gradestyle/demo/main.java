package gradestyle.
    demo;

import gradestyle.demo.Util.*;

import gradestyle.demo.Util.Utils.NotFoundException;
import java.util.*;

/** main class */
public class main {
/**
 * Main entrypoint for the BlackJack card printer.
 *
 * @param args cli args
 */
  public static void main(String args[]) {
    Utils.printBlackJack();

    while (true) {
      Utils._print("Enter a card (or exit): ");

      String rank, suit;
      rank = Utils.$input();

      // Utils._print(rank);

      boolean exit = rank.equals("exit");

      if(exit)
        break;

      try {
        Suit BJCardSuit;
        BJRank BJCardRank;

        BJCardRank = BJRank.getRank(rank);

        Utils._print("Enter a suit: ");
        suit = Utils.$input();

        // Utils._print9(suit)

        BJCardSuit = Suit.getSuit(suit);

        Utils._print(new BJCard(BJCardRank, BJCardSuit).toString());
        Utils._print(); Utils._print();
      } catch (NotFoundException e) {}
    }
  }

  @SuppressWarnings("unused") public void hello() {
    List<String> words = Arrays.asList("Hello", "World");
    Utils._print((String) words.get(0));
  }

  @Override protected void finalize() {
    Utils._print("Finalizing");
  }
}
