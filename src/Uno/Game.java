/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.List;

/**
 *
 * @author HuangHe
 */
public class Game {
    private String id;
    private List<Player> gamePlayers;
    private String gameStatus;
    private Deck gameDeck;
    private unoCard discardPile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Player> getGamePlayers() {
        return gamePlayers;
    }

    public void setGamePlayers(List<Player> gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Deck getGameDeck() {
       
        return gameDeck;
    }

    public void setGameDeck(Deck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public unoCard getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(unoCard discardPile) {
        this.discardPile = discardPile;
    }

    public Game(String id, List<Player> gamePlayers, String gameStatus, Deck gameDeck, unoCard discardPile) {
        this.id = id;
        this.gamePlayers = gamePlayers;
        this.gameStatus = gameStatus;
        this.gameDeck = gameDeck;
        this.discardPile = discardPile;
    }
    
    
    public void addPlayer(Player player){
        this.gamePlayers.add(player);
        
    }
    public unoCard takeCard(){
        return this.gameDeck.takeCard();
    }
    
    public void discardToPile (unoCard card){
        this.discardPile = card;
    }
    
    public unoCard takeFromPile(){
        unoCard card =this.discardPile;
        this.discardPile =null;
        return card;
    }
    
    public void changeStatus(String status){
        this.gameStatus = status;
    }
    
    
    
}


