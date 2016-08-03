/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HuangHe
 */
public class Player {
    
    
    private String name;
    private String id;
    private List<unoCard> handCards;

    public Player(String name, String id) {
        this.name = name;
        this.id = id;
        this.handCards = new ArrayList<unoCard>();
    }

    public Player(String name, List<unoCard> handCards) {
        this.name = name;
        this.handCards = handCards;
    }
    
   public void addToHand (unoCard card){
      
       this.handCards.add(card);
   }
   
   public unoCard removeFormHand(){
       if(this.handCards.isEmpty()){
           return null;
       }
       return this.handCards.remove(0);  
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<unoCard> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<unoCard> handCards) {
        this.handCards = handCards;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", id=" + id + '}';
    }
   
   
    
   
    
}
