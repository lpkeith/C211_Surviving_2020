
package pkg2020.trail;

import GUI.BadOutcome1;
import GUI.BadOutcome2;
import GUI.BadOutcome3;
import GUI.BadOutcome4;
import GUI.BadOutcome5;
import GUI.BestOutcome;
import GUI.GoodOutcome1;
import GUI.GoodOutcome2;
import GUI.HighScoreScreen;
import GUI.TitleScreen;
import GUI.QuestionScreen;
import GUI.SecondBestOutcome;
import GUI.ThirdBestOutcome;

/**
 *
 * @author Lance
 */
public class TrailTest {

    public static void main(String[] args){
        TitleScreen.showTitleScreen();
        QuestionScreen.showQuestionScreen();
        HighScoreScreen.showHighScoreScreen();
        BadOutcome1.showBadOutcome1();
        BadOutcome2.showBadOutcome2();
        BadOutcome3.showBadOutcome3();
        BadOutcome4.showBadOutcome4();
        BadOutcome5.showBadOutcome5();
        BestOutcome.showBestOutcome();
        SecondBestOutcome.showSecondBestOutcome();
        ThirdBestOutcome.showThirdBestOutcome();
        GoodOutcome1.showGoodOutcome1();
        GoodOutcome2.showGoodOutcome2();
        
        
    }
    
    
}
