
public class SecretCombination extends Combination {
    
    char[] sc; 
    boolean incorrect, repeated, invalidLength;
    

    char[] genSecretCombination() {

        int limit = 5, i = 0, j = 0;
        int numVector[] = new int[4];
        char[] secretCombination = new char[4];

        numVector[i] = (int) (Math.random() * limit);

        for (i = 1; i < numVector.length; i++) {
            numVector[i] = (int) (Math.random() * limit);

            for (j = 0; j < i; j++) {
                if (numVector[i] == numVector[j]) {
                    i--;
                }
            }
        }

        for (int k = 0; k < numVector.length; k++) {

            secretCombination[k] = super.colorsToString().charAt(numVector[k]);
        }

        return secretCombination;
    }

    void warningMSG(boolean incorrect, boolean repeated, boolean invalidLength){
        if (incorrect) {
            System.out.println(" Wrong colors, they must be: rbygop");
        }

        if (repeated) {
            System.out.println(" Repeated colors");
        }

        if (invalidLength) {
            System.out.println(" Wrong proposed combination length");
        }
    }
    
    boolean isValid(char[] proposedCombination){
        
        this.incorrect = false; this.repeated = false; this.invalidLength = false;
        String character = "", combinationString="";
        int iteration;
        
        for(char pc:proposedCombination){

            if (!super.colorsToString().contains(Character.toString(pc))) {
                incorrect = true;
            }
            
            iteration=0; combinationString=new String(proposedCombination);
            character = Character.toString(pc);
            while(combinationString.indexOf(character)!=-1){
                combinationString = combinationString.substring(combinationString.indexOf(character)+1,combinationString.length());
                iteration++;
            }
            if (iteration>1) {
                repeated = true;
            }
            
            
            if (super.colors.length < proposedCombination.length || proposedCombination.length != 4) {
                invalidLength = true;
            }
        } 
        return (!incorrect && !repeated && !invalidLength);
    }
    
    Result calculateResult(char[] proposedCombination, char[] secretCombination, ProposerPlayer proposerPlayer) {

        Result result = new Result();

        if (isValid(proposedCombination)) {

            for (int i = 0; i < proposedCombination.length; i++) {
                if (proposedCombination[i] == secretCombination[i]) {
                    result.setDie(result.getDie() + 1);
                } else {
                    for (int j = 0; j < proposedCombination.length; j++) {
                        if (secretCombination[i] == proposedCombination[j]) {
                            result.setDamaged(result.getDamaged() + 1);
                        }

                    }
                }
            } 
            proposerPlayer.setAttempts(proposerPlayer.getAttempts()+1);
        }else{
            warningMSG(this.incorrect, this.repeated, this.invalidLength);
        }
        return result;
    }

    String write(char[] proposedCombination, Result result) {
        return new String(proposedCombination) + " --> " + result.getDie() + " blacks and " + result.getDamaged() + " whites";
    }
    
    void setSecretCombination(char[] sc){
        this.sc = sc;
    }
    
    char[] getSecretCombination(){
        return this.sc;
    }
}
