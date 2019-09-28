
import java.util.*;

public class Mastermind {

    SecretPlayer secretPlayer = new SecretPlayer();
    ProposerPlayer proposerPlayer = new ProposerPlayer();
    
    void play() {

        Result result = null;
        
        System.out.println("\t----- MASTERMIND -----");
        proposerPlayer.setEndGame(false);
        proposerPlayer.setAttempts(0);
        proposerPlayer.setProposedCombinations("");
        
        secretPlayer.setProposerPlayer(proposerPlayer);
        secretPlayer.prepare();
        do{
            result = secretPlayer.answer(proposerPlayer.propose());
            proposerPlayer.writeAttempts();
            secretPlayer.writeEncode();
            secretPlayer.write(proposerPlayer.getLastPropose(), result);
        }while(result.getDie()!=4 && !proposerPlayer.getEndGame());
        
        if(result.getDie()==4){
            proposerPlayer.isWinner();
        }
        
        if(proposerPlayer.getEndGame()){
            proposerPlayer.isLooser();
        }
        
    }

    public static void main(String[] args) throws java.io.IOException {

        Mastermind mastermind = new Mastermind();
        
        Scanner input = new Scanner(System.in);
        String option="";
            
        do{
           mastermind.play();
           System.out.println("\tDo you want to continue? (s/n):");
           option = input.nextLine();
        }while(!option.toLowerCase().equals("n"));
    }

}
