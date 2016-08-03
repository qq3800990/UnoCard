/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HuangHe
 */
public class Deck {
    
    private int amount;
    private List<unoCard> deck;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<unoCard> getDeck() {
        return deck;
    }

    public void setDeck(List<unoCard> deck) {
        this.deck = deck;
    }

    public Deck(int amount, List<unoCard> deck) {
        this.amount = amount;
        this.deck = deck;
    }
    
    public static Deck createNewDeck(){
         String colors[]= {value.RED,value.YELLOW,value.BLUE,value.GREEN};
         String images[][]= {
            {value.RED_0, value.RED_1, value.RED_2, value.RED_3, value.RED_4, value.RED_5, value.RED_6, value.RED_7, value.RED_8, value.RED_9, value.RED_SKIP, value.RED_REVERSE, value.RED_DRAWTWO},
            {value.YELLOW_0, value.YELLOW_1, value.YELLOW_2, value.YELLOW_3, value.YELLOW_4, value.YELLOW_5, value.YELLOW_6, value.YELLOW_7, value.YELLOW_8, value.YELLOW_9, value.YELLOW_SKIP, value.YELLOW_REVERSE, value.YELLOW_DRAWTWO},
            {value.BLUE_0, value.BLUE_1, value.BLUE_2, value.BLUE_3, value.BLUE_4, value.BLUE_5, value.BLUE_6, value.BLUE_7, value.BLUE_8, value.BLUE_9, value.BLUE_SKIP, value.BLUE_REVERSE, value.BLUE_DRAWTWO},
            {value.GREEN_0, value.GREEN_1, value.GREEN_2, value.GREEN_3, value.GREEN_4, value.GREEN_5, value.GREEN_6, value.GREEN_7, value.GREEN_8, value.GREEN_9, value.GREEN_SKIP, value.GREEN_REVERSE, value.GREEN_DRAWTWO}};
         
         String types[] = {value.NORMAL,value.SKIP,value.REVERSE,value.DRAW2};
         System.out.println("The Game Is Loading, Please Wait.");
         
         // add cards into cardlist 
         List<unoCard> cardList = new ArrayList <unoCard>();
         unoCard card;
         unoCard card0;
         unoCard card1;
         //  normal card 
         for (int i= 0; i<4;i++){
             for (int j=0; j<13;j++){
                 if(j<9){
                     if(j==0){
                         card= new unoCard (colors[i],images[i][j],j,types[i]);
                         cardList.add(card);  // add card_0  for 1 time 
                     } else{
                         for(int x=0;x<2;x++){
                             card= new unoCard (colors[i],images[i][j],j,types[i]);
                         cardList.add(card);     //add card_1- card_9  for 2 times
                         }
                     }
                 }else{
                     for (int x=0;x<2;x++){
                         card = new unoCard (colors[i],images[i][j],20,types[i%9]);
                         cardList.add(card);  //add function card 
                     }
                 }
             }
             
             card0 = new unoCard(value.WILD,value.WILDCARD,50,value.WILD);
             card1 = new unoCard(value.DRAW4,value.DRAWFOUR,50,value.DRAW4);
             cardList.add(card0);
             cardList.add(card1);
            
         }
         Collections.shuffle(cardList);  // random cardlist
         Deck deck= new Deck(108,cardList);
         System.out.println("Loading Finished");
         return deck;
     
    }
    
    // take card from desk  
    public unoCard takeCard(){
      
       
        if(this.deck.isEmpty()){
           
            return null;
        }
     
        this.amount--;    // the number of card in deck -1 
       
        return this.deck.remove(0);
        
    }
    
    
}
    
