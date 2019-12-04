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
public class Player {
    
    
    private String playerID; //the unique ID for this player
    
    
    public Player(){
        
    }
    public Player(String name)
    {
        playerID= name;
    }
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
       this. playerID = givenID;
    }
    
   
    
}
