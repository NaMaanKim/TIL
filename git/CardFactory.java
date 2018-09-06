package examples.first;
import java.util.ArrayList;
import java.util.List;
public abstract class CardFactory {

    public static List<Card> create(){
        List<Card> list = new ArrayList<>();
        String [] types = new String[]{"클로버", "다이아", "하트", "스페이드"};
        for(String type : types){
            for(int i = 1; i <= 13; i++){
                Card card = new Card(type,i);
                list.add(card);
                }
            }   return list;
        }
    }
