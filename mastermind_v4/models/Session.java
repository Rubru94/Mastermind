package mastermind_v4.models;

import java.util.List;
import mastermind_v4.types.Color;

public class Session {

    private final Game game;
    private final State state;

    public Session() {
        this.game = new Game();
        this.state = new State();
    }

    public void next() {
        this.state.next();
    }

    public void clearGame() {
        this.game.clear();
        this.state.reset();
    }

    public void addProposedCombination(List<Color> colors) {
        this.game.addProposedCombination(colors);

    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public int getWidth() {
        return this.game.getWidth();
    }

    public List<Color> getColors(int position) {
        return this.game.getColors(position);
    }

    public int getBlacks(int i) {
        return this.game.getBlacks(i);
    }

    public int getWhites(int i) {
        return this.game.getWhites(i);
    }
}
