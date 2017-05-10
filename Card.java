package playingcards;

/**
 * Created by tahsinsyeed on 5/7/17.
 */
public class Card {

    private int suit;
    private int rank;





    public Card(int suit,int rank){

        this.rank = suit % 13 ;
        this.suit = rank % 4;
    }

    public int rank() {return rank;}


    public int suit() {return suit;}



    public String toString(){

        String ranks = "23456789TJQKA";
        String suits =  "\u2663\u2666\u2665\u2660";
        return ranks.charAt(rank) + " " + suits.charAt(suit);
    }


}
