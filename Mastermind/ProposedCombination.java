
import java.util.*;

public class ProposedCombination extends Combination {

    Scanner input = new Scanner(System.in);
    char[] pc;
    
    char[] read() {

        String move = "";

        System.out.print("\n Propose a combination: ");
        move = input.nextLine();

        return move.toCharArray();
    }
    
    void setProposedCombination(char[] pc){
        this.pc = pc;
    }
    
    char[] getProposedCombination(){
        return this.pc;
    }
}
