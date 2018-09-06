package examples.first;
public class Card {
    private int number;
    private String type;
    public Card(String type, int number){
        this.type = type;
        this.number = number;
    }
    public String getType(){
        return type;
    }
    public int getNumber(){
        return this.number;
    }


    @Override
    public String toString(){
        String strNumber = number + "";
        if(number == 1 ){
            strNumber = "A";
        }
        else if(number == 11){
            strNumber = "J";
        }
        else if(number == 12){
            strNumber = "Q";
        }
        else if(number == 13){
            strNumber = "K";
        }

            return type + " [ " + strNumber + " ] ";
    }
}
