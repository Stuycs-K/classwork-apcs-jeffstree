import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter username: ");
    String username = userInput.nextLine();
    System.out.println("Username is: " + username);

  }
}
