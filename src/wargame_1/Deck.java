/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame_1;

/**
 *
 * @author Parthu
 */
    
 import java.util.ArrayList;

public class Deck{

	ArrayList<Card> PlayingCards = new ArrayList<Card>();
	
	public ArrayList<Card> createDeck()
	{
                        String[] suits = {"Spade","Hearts","Diamond","Clubs"};
		
		
                            for(int i=0; i<4; i++)
                                  {
                                        for(int sub=2; sub<15; sub++)
                                            {
			Card newCard = new Card(suits[i], sub);
			PlayingCards.add(newCard);
                                            }
		}
	
                        return PlayingCards;
	}
	
}


