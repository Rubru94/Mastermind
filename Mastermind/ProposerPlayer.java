
public class ProposerPlayer {

    int attempts = 0;
    boolean endgame = false;
    ProposedCombination proposedCombination = new ProposedCombination();
    String proposedCombinations = "";

    char[] propose() {
        this.proposedCombination.setProposedCombination(proposedCombination.read());
        return this.proposedCombination.getProposedCombination();
    }

    char[] getLastPropose() {
        return this.proposedCombination.getProposedCombination();
    }

    void writeAttempts() {
        System.out.println(this.attempts + " attempts(s): ");
    }
 
    void setProposedCombinations(String combination) {
        this.proposedCombinations = combination;
    }
    
    void writeProposedCombinations(String combination) {
        this.proposedCombinations += combination + "\n";
        System.out.println(this.proposedCombinations);
    }

    void isWinner() {
        System.out.println(" You've won!!! ;-)");
    }

    void isLooser() {
        System.out.println(" You've lost!!! :-(");
    }
    
    void setAttempts(int attempts){
        this.attempts = attempts;
        if(this.attempts>=10){
            this.endgame = true;
        }
    }
    
    int getAttempts(){
        return attempts;
    }
    
    void setEndGame(boolean endgame){
        this.endgame = endgame;
    }
    
    boolean getEndGame(){
        return this.endgame;
    }
}
