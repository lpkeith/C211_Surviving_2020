
import java.util.*;

public class game
{
    //initializes arraylist to hold PlayerScore objects  
    ArrayList<PlayerScore> listOfPlayers = new ArrayList<PlayerScore>(); 

    
    //method to determine your outcome based on your score
    //input the user's score and output what happened to them
    public String determineOutcome(int score)
    {
        Random rand = new Random();
        
        //array that stores bad outcomes to be chosen at random 
        String[] badOutcome = {"You ran out of toilet paper.", 
                               "You wanted to fight quarantine boredom, but the PlayStation 5 was sold out.",
                               "You went hiking and were swarmed by murden hornets.",
                               "Your TikTok went viral -- for being so cringey.",
                               "The seed packets were for Audrey II. You've become plant food."};
        
        //if you're score is less than 0, you get a random bad outcome
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
