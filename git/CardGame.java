package examples.first;
import java.util.ArrayList;
import java.util.List;
public class CardGame {

    public static void main(String [] args){
        List<Card> cards = CardFactory.create();
        Dealer dealer = new Dealer("고니");
        dealer.setCards(cards);
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player("홍길동"));
        playerList.add(new Player("김길동"));
        playerList.add(new Player("고길동"));
        dealer.setPlayerList(playerList);
        dealer.newGame();
        dealer.Mix();
            for(int i = 0; i < 5; i++){
                for(Player player : playerList){
                    player.addCard(dealer.getCard());
            }
        }
        dealer.result();
        }
    }
