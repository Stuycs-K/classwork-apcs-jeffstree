public class Warrior extends Adventurer{
  private int RP, maxRP;

  //constructors
  public Warrior(String name){
    super(name);
    this.RP = 10;
    this.maxRP = 10;
  }

  public Warrior(String name, int hp){
    super(name, hp);
    this.RP = 10;
    this.maxRP = 10;
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
    other.applyDamage(2);
    return this.getName() + " deals 2 damage to " + other.getName() + "!";
  }

   //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setSpecial(other.getSpecial() + 2);
    if (other.getSpecialMax() < other.getSpecial()){
      other.setSpecial(other.getSpecialMax());
    }
    return this.getName() + " increases " + other.getName() + "'s " + other.getSpecialName() + "!";
  }

   //heall or buff self
  public String support(){
    setSpecial(getSpecial() + 2);
    if (getSpecialMax() < getSpecial()){
      setSpecial(getSpecialMax());
    }
    return getName() + " increases rage by 2!";
  }

   //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (getSpecial() >= 5){
      this.setSpecial(this.getSpecial() - 5);
      other.applyDamage(4);
      return getName() + " consumes rage, deals 4 damage!";
    }
    else{
      return getName() + " does not have enough rage, attack fails!";
    }
    
  }
}
