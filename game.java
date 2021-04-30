package GUI;

import java.util.*;

public class game
{
    //initializes arraylist to hold PlayerScore objects  
    ArrayList<PlayerScore> listOfPlayers = new ArrayList<PlayerScore>(); 

   
    //allows arraylist to be copied over into other classes
    public ArrayList<PlayerScore> getList()
    {
       return listOfPlayers; 
    }
    
    //Trying to get this to sort my arraylist by score
     public static void sort(ArrayList<PlayerScore> listOfPlayers)
    {
  
              //  listOfPlayers.sort((o1, o2) -> o1.getScore().compareTo(o2.getScore()));
        
        //prints out list to see if it is sorted
        for(PlayerScore i : listOfPlayers)
        {
            System.out.println(i);
        }
              
    }
     
     //accepts the score at the end of the game and uses it to create a new object
    //to store the player's name and score to later display
    //like an old arcade game
    public static PlayerScore newPlayer(int score)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        
        PlayerScore player = new PlayerScore(name, score);
        
        return player;
    }
    
    
    //method to display high score at the end of the game
    public void scoreDisplay(ArrayList<PlayerScore> listOfPlayers)
    {
        System.out.println("High Scores");
        System.out.println("_____________");
        for(PlayerScore i : listOfPlayers)
        {
            System.out.println(i);
        }
                
    }
    
    
    
  
}
