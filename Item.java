/* Item.java
 * Written by Vincent Zelinsky
 * 
 * Creates the superclass Item which declares three fields (name, weight, and examine), three constructors, and getters for the three fields
 * 
 * I cannot find a reason to allow other team members to use setters on name, examine, and especially the weight fields.
 * These fields, once set in an object's creation, have no reason to be set again. Why would you change the name? Why would you change the weight?
 * The only reason I can see these needing to be set is if the object was somehow modified by the player and instead of using a new object you wanted to edit an existing one.
 * I will add them for the sake of convenience for my pretend team if I have extra time. (I did not)
 */
//Creates the superclass Item which contains the fields for name, weight, and examine
public class Item {
  //Declares three fields: name, weight, and examine
  private String name;
  private int weight;
  private String examine;
  
  //Creates a constructor for Item that is meant to be invoked by the creation of an Item object
  public Item (String nameInput, int weightInput, String examineInput){
    this.name = nameInput;
    this.weight = weightInput;
    this.examine = examineInput;
  }
  //Adds a second constructor for Item that is meant to be invoked by any subclass constructors that wish to add to the examine field
  public Item (String nameInput, int weightInput){
    this.name = nameInput;
    this.weight = weightInput;
  }
  //Adds a third constructor for Item that is meant to be invoked by the Food subclass to add to the weight field
  public Item (String nameInput){
    this.name = nameInput;
  }
  //Creates method to get name
  public String getName(){
    return name;
  }
  //Creates method to get weight
  public int getWeight(){
    return weight;
  }
  //Creates method to get examine
  public String getExamine(){
    return examine+"\nIts name is: "+name+"\nIts weight is: "+weight;
  }
}