package studentWork.CardLab;

public class WarGameClient {
    
    public static void main(String[] arg){
        Deck warDeck = new Deck();
        warDeck.shuffle();
        Deck deckPlayer = warDeck.deal(warDeck.size(/2));
        Deck deckComputer = warDeck.deal(warDeck.size());
int i=0;
       
       
        
        while (deckPlayer.hasNext() && deckComputer.hasNext()) {
System.out.println("this is round" + i);

        Card a = deckPlayer.draw();
        Card b = deckComputer.draw();
        System.out.println("The players " + a.toString());
        System.out.println("The computers " + b.toString());
i++;



        }
    }
}