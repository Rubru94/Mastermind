package mastermind_v2.models;

import java.util.ArrayList;
import java.util.List;
import mastermind_v2.utils.YesNoDialog;
import mastermind_v2.views.console.Message;

public class Game {

    public static final int MAX_LONG = 2;
    public SecretCombination secretCombination;
    public List<ProposedCombination> proposedCombinations;
    public List<Result> results;

    public Game() {
        this.clear();
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
    }

    public boolean isFinished() {
        if (this.results.get(this.getAttemps() - 1).isWinner()) {
            Message.WINNER.writeln();
            return true;
        }
        if (this.getAttemps() == MAX_LONG) {
            Message.LOOSER.writeln();
            return true;
        }
        return false;
    }

    public int getAttemps() {
        return this.proposedCombinations.size();
    }

    public boolean isResumed() {
        boolean resumed;
        Message.RESUME.write();
        resumed = new YesNoDialog().read();
        if (resumed) {
            this.clear();
        }
        return resumed;
    }
}
