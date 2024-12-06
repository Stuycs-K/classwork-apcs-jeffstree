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
  }
}
