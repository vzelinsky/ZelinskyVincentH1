//Creates the class Armor which contains the fields for name, weight, examine, and damage
public class Armor extends Item{
  //Declares the fields defense and examine
  private int defense;
  private String examine;
  
  //Creates a constructor for Armor that invokes the second constructor in Item and adds to it
  public Armor (String nameInput, int weightInput, String examineInput, int defenseInput){
    super(nameInput, weightInput);
    this.examine = examineInput;
    this.defense = defenseInput;
  }
  //Creates a method to get damage
  public int getDefense(){
    return defense;
  }
  //Overloads the getExamine method so when called it adds defense
  @Override
  public String getExamine(){
    return examine+"\nIts name is: "+getName()+"\nIts weight is: "+getWeight()+"\nIts defense is: "+defense;
  }
}