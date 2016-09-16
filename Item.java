//Creates the superclass Item which contains the fields for name, weight, and examine
public class Item {
  //Declares three fields: name, weight, and examine
  private String name;
  private int weight;
  private String examine;
  //Creates a constructor for Item
  public Item (String name, int weight, String examine){
    this.name = name;
    this.weight = weight;
    this.examine = examine;
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
    return examine;
  }
}