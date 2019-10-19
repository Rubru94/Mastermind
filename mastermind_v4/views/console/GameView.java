package mastermind_v4.views.console;

import java.util.ArrayList;
import java.util.List;
import mastermind_v4.types.Color;
import mastermind_v4.views.MessageView;

public class GameView {

    private int attempts;

    private int width;

    private final List<List<Color>> allColors;

    private final List<List<Integer>> allResults;

    public GameView() {
        this.allColors = new ArrayList<>();
        this.allResults = new ArrayList<>();
    }

    public void writeGame() {
        MessageView.NEW_LINE.writeln();
        new AttemptsView().writeln(this.attempts);
        new SecretCombinationView().writeln(this.width);
        for (int i = 0; i < this.allColors.size(); i++) {
            new ProposedCombinationView().write(this.allColors.get(i));
            new ResultView().writeln(this.allResults.get(i));
        }
    }

    public void writeLooser() {
        MessageView.LOOSER.writeln();
    }

    public void writeWinner() {
        MessageView.WINNER.writeln();
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void clearAllColors() {
        this.allColors.clear();
    }

    public void clearAllResults() {
        this.allResults.clear();
    }

    public void setAllColors(List<Color> colors) {
        this.allColors.add(colors);
    }

    public void setAllResults(int blacks, int whites) {
        List<Integer> results = new ArrayList<>();
        results.add(blacks);
        results.add(whites);
        this.allResults.add(results);
    }
}
