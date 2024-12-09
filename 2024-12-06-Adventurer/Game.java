import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter username: ");
    String username = userInput.nextLine();
    System.out.println("Username is: " + username);

    Adventurer player = new Warrior(username);
    Adventurer enemy = new CodeWarrior("Emerie the Enemy");

    String playerInfo = player + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName();
    String enemyInfo = enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName();
    System.out.println("You are: " + playerInfo);
    System.out.println("Your opponent is: " + enemyInfo);
  }
}
