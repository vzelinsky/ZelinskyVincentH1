//Creates the class Food which contains the fields for name, weight, examine, nutrition, and quantity
public class Food extends Item{
  //Declares the fields damage and examine
  private int nutrition;
  private int quantity;
  private int weight;
  private String examine;
  
  //Creates a constructor for Food that invokes the third constructor in Item and adds to it
  public Food (String nameInput, int weightInput, String examineInput, int nutritionInput, int quantityInput){
    super(nameInput);
    this.weight = weightInput;
    this.examine = examineInput;
    this.nutrition = nutritionInput;
    this.quantity = quantityInput;
  }
  //Creates a method to get nutrition
  public int getNutrition(){
    return nutrition;
  }
  //Creates a method to get quantity
  public int getQuantity(){
    return quantity;
  }
  //Creates a method to set quantity
  public void setQuantity(int quantityInput){
    quantity = quantityInput;
  }
  //Overloads the getWeight method so when called it returns weight*quantity
  @Override
  public int getWeight(){
    return weight*quantity;
  }
  //Overloads the getExamine method so when called it adds nutrition and quantity
  @Override
  public String getExamine(){
    return examine+"\nIts name is: "+getName()+"\nIts weight is: "+getWeight()+"\nIts nutrition is: "+nutrition+"\nIts quantity is: "+quantity;
  }
}