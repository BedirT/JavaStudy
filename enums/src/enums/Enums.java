/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author BedirTapkan
 */
public class Enums {

    /**
     * @param args the command line arguments
     */
    enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, 
        jack, queen, king
    }
    public static void main(String[] args) {
        
       Rank highCard = Rank.ace;
       Rank faceCard = Rank.king;
       Rank card1 = Rank.eight;
       Rank card2 = Rank.seven;
       
       System.out.println("A blackjack hand: " + highCard + " and " + faceCard );
       
       int card1Val = card1.ordinal()+1 ; 
       int card2Val = card2.ordinal()+1 ;
       
       System.out.println("A two card hand: "+ card1 +" " + card2 );
       System.out.println("Hand value: "+ (card1Val + card2Val) );
    }
    
}
