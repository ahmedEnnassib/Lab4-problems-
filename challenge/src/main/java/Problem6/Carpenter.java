package Problem6;

public class Carpenter extends Person{
    public String name;
    public Carpenter(String name){
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("I am " + name + " the Carpenter");
    }
}
