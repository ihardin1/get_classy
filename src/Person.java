public class Person {
    String firstName;
    String lastName;
    String ID;
    String title;
    int YOB;
    public Person ( String firstName,String lastName, String ID, String title, int YOB){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ID=ID;
        this.title=title;
        this.YOB=YOB;
    }
    public String fullName(){
        return firstName+" "+lastName;
    }
    public String formalName(){
        return title+" "+this.fullName();
    }
    public int getAge(){
        return 2023-YOB;
    }
    public int getAge(int year){
        return year-YOB;
    }

}
