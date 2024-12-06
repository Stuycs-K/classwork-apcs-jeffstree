public class Warrior extends Adventurer{
  private int RP, maxRP;

  //constructors
  public Warrior(String name){
    super(name);
  }

  public Warrior(String name, int hp){
    super(name, hp);
  }

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */

  public String getSpecialName(){
    return "rage";
  }

  public int getSpecial(){
    return RP;
  }

  public void setSpecial(int n){
    RP = n;
  }

  public int getSpecialMax(){
    return maxRP;
  }

  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    return "";
  }

   //heall or buff the target adventurer
  public String support(Adventurer other){
    return "";
  }

   //heall or buff self
  public String support(){
    return "";
  }

   //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    return "";
  }
}
