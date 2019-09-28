
public class SecretPlayer {

    SecretCombination secretCombination = new SecretCombination();
    ProposerPlayer proposerPlayer;
    
    void prepare() {
        this.secretCombination.setSecretCombination(secretCombination.genSecretCombination());
    }

    Result answer(char[] proposedCombination) {
       return secretCombination.calculateResult(proposedCombination, this.secretCombination.getSecretCombination(), this.proposerPlayer);
    }

    void write(char[] proposedCombination, Result result) {
       if(this.secretCombination.isValid(proposedCombination)){
           this.proposerPlayer.writeProposedCombinations(secretCombination.write(proposedCombination, result));
       }
    }
    
    void setProposerPlayer(ProposerPlayer proposerPlayer){
        this.proposerPlayer = proposerPlayer;
    }
    
    void writeEncode(){
        for(char s:this.secretCombination.getSecretCombination()){
            System.out.print('*');
        }
        System.out.print('\n');
    }
}
