package Week7.sept20Warmup;

public class Profile {
    private String name;
    private int age;
    public Profile(){
        name = "John";
        age = 15;
    }
    public Profile(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void printInfo(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
    public void printInfo(int id){
        System.out.println("ID: " + id);
        printInfo();
    }
}
