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
public class TestGame {
    
    public static Game loadGame(){
        Deck deck = Deck.createNewDeck();
        String id= "qq";
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("aa","aa"));
        players.add(new Player("bb","bb"));
        players.add(new Player("cc","cc"));
        players.add(new Player("dd","dd"));
        players.add(new Player("ee","ee"));
        System.out.println("Players Is Ready");
        System.out.println("Game Greated");
        return new Game(id,players,value.Game_Start,deck,deck.takeCard());
       
    }
    
    public static void main (String[] args){
        Game newGame =loadGame();
        System.out.println("Start to Deal Card");
        for(Player p : newGame.getGamePlayers()){
            
            for (int i=0;i<7;i++){
                p.addToHand(newGame.getGameDeck().takeCard());
              
            }
        }
        
        System.out.println("     start");
        System.out.println("ID:"+newGame.getId());
        System.out.println("Discard :card:" +newGame.getDiscardPile());
        System.out.println("Cards on deck:"+ newGame.getGameDeck().getAmount());
        
        for (Player p : newGame.getGamePlayers()){
            System.out.println("  Player:"+p);
            System.out.println(" card in hand");
          for (unoCard c: p.getHandCards()){
              System.out.println("  card:"+c);
          }
          System.out.println();
        }
    }
}
