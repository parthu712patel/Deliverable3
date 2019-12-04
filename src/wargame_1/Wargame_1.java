/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Parthu
 */
public class Wargame_1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        String player1id; // define player1 id
        String player2id; // define player2id
        
         Player p = new Player();
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Player1 ID is :" );
       player1id = sc.nextLine();
        p.setPlayerID(player1id);
        p.getPlayerID();
        
       System.out.println("Player2 ID is :" );
       player2id = sc.nextLine();
        p.setPlayerID(player2id);
        p.getPlayerID();
        
    
         
        ArrayList<Card> Deck = new ArrayList<Card>();
        Deck D = new Deck();
        Deck = D.createDeck(); //create a deck of 52 cards
        Collections.shuffle(Deck);                            
		
        ArrayList<Card> Deck1, Deck2, Player1cards, Player2cards, tempShuffle;
        Deck1 = new ArrayList<Card>();   //player one's deck
        Deck2 = new ArrayList<Card>();   //  player two's deck
                
        Player1cards = new ArrayList<Card>();	//player one's playing cards
        Player2cards = new ArrayList<Card>();	//player two's playing cards
                
        tempShuffle = new ArrayList<Card>();	// get shuffled before going to any player's deck
		
		
        int count = 0;
        //Deal Cards
         System.out.println("Deck Size:" + Deck.size());
		
	for (int i=0; i<Deck.size(); i++)	
	{
                        if(i%2==0)
                        {
                            Deck1.add(Deck.get(i));
                        }else{
                            Deck2.add(Deck.get(i));
                        }
	}
		
		
	System.out.println(player1id +"'s Deck Size:" + Deck1.size());
	System.out.println(player2id + "'s Deck Size:" + Deck2.size());
		
	System.out.println("\n Players ---------------------------- ScoreBord");
	System.out.format("\n %10s   %10s %10d %10d",player1id,player2id, Deck1.size() ,Deck2.size());
	System.out.println("\n------------------------------------------------------");
        
	int war = 0;
	String str1;
                  String str2;
	while(Deck1.size() > 0 && Deck2.size() > 0)
	{
                        Player1cards.add(Deck1.remove(0)); //player one places first card from  deck 
                        Player2cards.add(Deck2.remove(0)); //player two places first card from deck 
                        count++;
                        str1 = (Player1cards.get(Player1cards.size()-1).suits );
                        str2 =  (Player2cards.get(Player2cards.size()-1).suits); 
			
                        if (war > 0){
		war--;
		System.out.format("\n %10s %10s %20s", str1 , str2,"Time to FaceDown");
                        }
                        else if (Player1cards.get(Player1cards.size()-1).value > Player2cards.get(Player2cards.size()-1).value)
                        {
		tempShuffle.addAll(Player1cards);
		tempShuffle.addAll(Player2cards);
		Collections.shuffle(tempShuffle);
		Deck1.addAll(tempShuffle);
		Player1cards.clear();
		Player2cards.clear();
		tempShuffle.clear();
		System.out.format("\n %10s %10s %10d %10d", str1,str2, Deck1.size(), Deck2.size());
                        }
                        else if (Player1cards.get(Player1cards.size()-1).value < Player2cards.get(Player2cards.size()-1).value)
                        {
		tempShuffle.addAll(Player1cards);
		tempShuffle.addAll(Player2cards);
		Collections.shuffle(tempShuffle);
		Deck2.addAll(tempShuffle);
		Player1cards.clear();
		Player2cards.clear();
		tempShuffle.clear();
		System.out.format("\n %10s %10s %10d %10d", str1,str2, Deck1.size(), Deck2.size());
                        }
	//scenario 3: both players have same value card			
                         else if (Player1cards.get(Player1cards.size()-1).value == Player2cards.get(Player2cards.size()-1).value)
                        {
		war++;
		System.out.format(" \n %10s %10s %20s ", str1,str2, "War Time");
                        }
                        else{
		System.out.println();
                        }
	}
		
	if (Deck1.size() == 0 && Deck2.size() > 0){
           
                        System.out.println("\n Congratulations !!!!" +  player2id +  "wins!");
        
                  }
                   else if (Deck1.size() > 0 && Deck2.size() == 0)
	{
                        System.out.println("\n Congratulations !!!!" + player1id + " wins!");
	}
	else if (Deck1.size() == 0 && Deck2.size() == 0)
	{
                        System.out.println("\nGame Tied!");	
	}
                
    }
}

    

