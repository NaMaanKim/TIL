package examples.first;
import java.util.Collections;
import java.util.List;
public class Dealer {
    private String name;
    private List<Player> playerList;
    private List<Card> cardList;
    private int index;
    public Dealer(String name){
        this.name = name;
        this.index = 0;
    }
    public void setPlayerList(List<Player> playerList){
        this.playerList = playerList;
    }
    public void setCards(List<Card> cardList){
        this.cardList = cardList;
    }

    public void newGame(){
        index = 0;
        for(Player player : playerList){
            player.clear();
        }
    }
    public void Mix(){
        Collections.shuffle(cardList);
    }

    public Card getCard(){
        Card card = cardList.get(index);
        index++;
        return card;
    }

    public void result(){
        for(Player player : playerList){
                System.out.println(player.getCards());
            }
        }
    }
