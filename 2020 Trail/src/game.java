
import java.util.ArrayList;
import java.util.Random;

public class game
{
    //initializes arraylist to hold PlayerScore objects  
    ArrayList<PlayerScore> listOfPlayers = new ArrayList<PlayerScore>(); 

    
    //method to determine your outcome based on your score
    //input the user's score and output what happened to them
    public String determineOutcome(int score)
    {
        Random rand = new Random();
        
        String[] badOutcome = {"You ran out of toilet paper.", 
                               "You wanted to fight quarantine boredom, but the PlayStation 5 was sold out.",
                               "You went hiking and were swarmed by murden hornets.",
                               "Your TikTok went viral -- for being so cringey.",
                               "The seed packets were for Audrey II. You've become plant food."};
        
        String result = "";
        if(score < 0)
        {
            int index = rand.nextInt(badOutcome.length);
            return badOutcome[index];
        }
        else if(score == 0)
        {
            return "You made it through the year and it was pretty normal for you.";
        }
        else if(1 <= score || score <= 10)
        {
            return "You learned some valuable new skills due to your increased free time.";
        }
        else if(11 <= score || score <= 20)
        {
            return "Your Tik Tok is blowing up, you’ve been added to the creator fund!";
        }
        else if(21 <= score || score <= 30)
        {
            return "You were selected to receive the vaccine early!";
        }
        else
        {
            return "Treasury department deposited two stimmys into your bank account.";
        }
   
    }
    
    //allows arraylist to be copied over into other classes
    public ArrayList<PlayerScore> getList()
    {
       return listOfPlayers; 
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
