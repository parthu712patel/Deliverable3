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
public class Card {
    
	String suits; //Spade ,Hearts ,Diamond ,Clubs
	String face; 
	int value; //define values 2,3,4,5,6,7,8,9,10,11,12,13,14
	
	Card(String s, int v) {
		suits = s;
		value = v;
		
		
			if (value == 11)
				suits = s + "Jack ";
			else if (value == 12)
				suits = s + "Queen ";
			else if (value == 13)
				suits = s + "King ";
			else if (value == 14)
				suits = s + "Ace ";
			else if (value == 10)
				suits = s + value;
			else 
				suits = s + value + " ";
	}
}
    

