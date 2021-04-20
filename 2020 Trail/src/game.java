
import java.util.ArrayList;

public class game
{
   
    
  ArrayList<PlayerScore> listOfPlayers = new ArrayList<PlayerScore>(); 

    
    //method to determine your outcome based on your score
    //input the user's score and output what happened to them
    public String determineOutcome(int score)
    {
        String result = "";
        if(score < 0)
        {
            
        }
        return result;
    }
    
    public ArrayList<PlayerScore> getList()
    {
       return listOfPlayers; 
    }
    
    //method to display high score at the end of the game
    public void scoreDisplay(ArrayList<)
    {
        System.out.println("High Scores");
        System.out.println("_____________");
        for(PlayerScore i : listOfPlayers)
        {
            System.out.println(i)
        }
                
    }
    
  
}
