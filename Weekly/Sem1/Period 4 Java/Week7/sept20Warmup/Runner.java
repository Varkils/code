package Week7.sept20Warmup;

public class Runner {

    public static void main(String[] arge){
        Profile p1 = new Profile();
        Profile p2 = new Profile("Jennifer", 16);
        p1.printInfo();
        p2.printInfo();
        p1.printInfo(1234);
        p2.printInfo(4321);
        
    }
}
