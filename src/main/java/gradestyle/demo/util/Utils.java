package gradestyle.demo.Util;
import java.util.Scanner;

public class Utils {
  /**
   *Prints a string to the console.
   */
  public static void _print(String s) {
    System.out.print(s); // print s to System.out
  }

  private final static Scanner scanner = new Scanner(System.in);

  public static class NotFoundException extends Exception {
    public NotFoundException(String message) {
      super(message);
    }
  }

  public static String $input() {
    return scanner.nextLine();
  }

  /** @see System.out#println() */
  public static void _print() {
    System.out.println();
  }

  /**
   * @param i integer to convert to character
   * @return the appropriate character
   */
  public static char text(int i) {
    return (char)(i + '0');
  }

	public static void printBlackJack() {
		System.out.println(
			"/$$       /$$                     /$$                               /$$       \n" +
			"| $$      | $$                    | $$                              | $$      \n" +
			"| $$$$$$$ | $$  /$$$$$$   /$$$$$$$| $$   /$$ /$$  /$$$$$$   /$$$$$$$| $$   /$$\n" +
			"| $$__  $$| $$ |____  $$ /$$_____/| $$  /$$/|__/ |____  $$ /$$_____/| $$  /$$/\n" +
			"| $$  \\ $$| $$  /$$$$$$$| $$      | $$$$$$/  /$$  /$$$$$$$| $$      | $$$$$$/ \n" +
			"| $$  | $$| $$ /$$__  $$| $$      | $$_  $$ | $$ /$$__  $$| $$      | $$_  $$ \n" +
			"| $$$$$$$/| $$|  $$$$$$$|  $$$$$$$| $$ \\  $$| $$|  $$$$$$$|  $$$$$$$| $$ \\  $$\n" +
			"|_______/ |__/ \\_______/ \\_______/|__/  \\__/| $$ \\_______/ \\_______/|__/  \\__/\n" +
			"                                       /$$  | $$                              \n" +
			"                                      |  $$$$$$/                              \n" +
			"                                       \\______/                               \n\n");
	}
}

class Helpful {
  private static <Generic> void notVeryHelpful() {
    int redundant = 0;
    redundant++;
    return;
  }
}
