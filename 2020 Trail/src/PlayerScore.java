/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abi
 */
public class PlayerScore 
{
     // Instance varibles
    private String playerName; 
    private int playerScore;
    
      //object that contains player's name and their score
    public PlayerScore (String name, int score)
    {
        playerName = name;
        playerScore = score;
    }
    
    //getters
    public String getName()
    {
        return playerName;
    }
    
    public int getScore()
    {
        return playerScore;
    }
    
    //setters
    public void setName(String name)
    {
        playerName = name;
    }
    
    public void setScore(int score)
    {
        playerScore = score;
    }
    
    //returns a string representation of the object
    public String toString()
    {
        String result;
        result = "Player Name: " + playerName + "\nPlayer Score: " + playerScore;
        return result;
    }        
    
    
}
