package Problem6;

public class Plumber extends Person{
    public String name;
    public Plumber(String name){
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("I am " +  name + " the Plumber");
    }
}
