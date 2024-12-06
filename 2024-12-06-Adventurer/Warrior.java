public class Warrior extends Adventurer{

  public Warrior(String name){
    super(name);
  }

  public Warrior(String name, int hp){
    super(name, hp);
  }

  public String getSpecialName(){
    return "";
  }

  public int getSpecial(){
    return 0;
  }

  public void setSpecial(int n){
    return;
  }

  public int getSpecialMax(){
    return 0;
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
