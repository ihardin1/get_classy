public class Product {
    String ID;
    String name;
    String Description;
    Double cost;

    public Product(String ID, String name, String Description, Double cost){
        this.ID=ID;
        this.name=name;
        this.Description=Description;
        this.cost=cost;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return Description;
    }
    public Double getCost(){
        return cost;
    }
    public void setCost(Double cost){
        this.cost=cost;
    }
    public String toCSV(){
        return this.ID+","+this.name+","+this.Description+","+this.cost;
    }

}
