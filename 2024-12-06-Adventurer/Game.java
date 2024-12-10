import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter username: ");
    String username = userInput.nextLine();

    Adventurer player = new Warrior(username);
    Adventurer enemy = new CodeWarrior("Emerie the Enemy", 8);

    String playerInfo = player + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName();
    String enemyInfo = enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName();
    System.out.println("You are: " + playerInfo);
    System.out.println("Your opponent is: " + enemyInfo);

    while(true){

      boolean validAction = false;
      while(!validAction){ //player actions
        System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / quit");
        String playerAction = userInput.nextLine();
        if(playerAction.equals("a") || playerAction.equals("attack")){
          System.out.println(player.attack(enemy));
          validAction = true;
        }
        else if(playerAction.equals("sp") || playerAction.equals("special")){
          System.out.println(player.specialAttack(enemy));
          validAction = true;
        }
        else if(playerAction.equals("su") || playerAction.equals("support")){
          System.out.println(player.support());
          validAction = true;
        }
        else if (playerAction.equals("quit")){
          return;
        }
        else{
          System.out.println("Invalid move! Please select (a)ttack / (sp)ecial / (su)pport / quit");
        }
      }

      if(enemy.getHP() <= 0){ //checks if enemy died from player attack
        System.out.println(player + " has defeated " + enemy + "!");
        return;
      }

      int randInt = (int)(Math.random() * 3); //enemy actions
      if (randInt == 0){
        System.out.println(enemy.attack(player));
      }
      else if (randInt == 1){
        System.out.println(enemy.specialAttack(player));
      }
      else if (randInt == 2){
        System.out.println(enemy.support());
      }

      if(player.getHP() <= 0){ //checks if player died from enemy attack
        System.out.println(enemy + " has defeated " + player + "!");
        return;
      }

      playerInfo = player + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " +
             player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName();
      enemyInfo = enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + 
            enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName();
      System.out.println(playerInfo);
      System.out.println(enemyInfo);
    }
  }
}
