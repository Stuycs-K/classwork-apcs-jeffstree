public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Warrior("Bob", 10);
    System.out.println("Name: " + p1);

    System.out.println("HP: " + p1.getHP());
    System.out.println("Max HP: " + p1.getmaxHP());

    p1.setHP(99999);
    p1.setmaxHP(99999999);
    System.out.println("HP: " + p1.getHP());
    System.out.println("Max HP: " + p1.getmaxHP());

    System.out.println("Special: " + p1.getSpecialName());
    System.out.println("Rage Points: " + p1.getSpecial());
    System.out.println("Max RP: " +p1.getSpecialMax());

    p1.setSpecial(99999);
    System.out.println("RP: " + p1.getSpecial());

//--------------------------------------------------------
    Adventurer enemy = new Warrior("Emerie the Enemy");
    Adventurer ally = new Warrior("Alejandra the Ally");

    System.out.println("\nBattle!");
    System.out.println(p1.attack(enemy));
    System.out.println("Emerie's HP: " + enemy.getHP());

    System.out.println("\n" + ally.specialAttack(enemy));
    System.out.println("Emerie's HP: " + enemy.getHP());
    System.out.println("Alejandra's Rage: " + ally.getSpecial());

    System.out.println("\n" + p1.specialAttack(enemy));
    System.out.println("Emerie's HP: " + enemy.getHP());
    System.out.println("Bob's Rage: " + p1.getSpecial());

    System.out.println("\n" + p1.support(ally));
    System.out.println(p1.support());
    System.out.println("Alejandra's Rage: " + ally.getSpecial());
    System.out.println("Bob's Rage: " + p1.getSpecial());

    System.out.println("\n" + ally.specialAttack(enemy));
    System.out.println("Emerie's HP: " + enemy.getHP());
    System.out.println("Alejandra's Rage: " + ally.getSpecial());
    
    System.out.println("\n" + ally.specialAttack(enemy));
    System.out.println("Emerie's HP: " + enemy.getHP());
    System.out.println("Alejandra's Rage: " + ally.getSpecial());
  }
}
