package Week5.Feb5Warmup;

public class Card {
    private int value;

    public Card(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public String  toString(){
        return "value: " + value;
    }
}
