package mastermind_v4.controllers;

import java.util.List;

import mastermind_v4.models.Combination;
import mastermind_v4.models.Session;
import mastermind_v4.types.Color;
import mastermind_v4.types.Error;
import mastermind_v4.views.ErrorView;
import mastermind_v4.views.console.GameView;
import mastermind_v4.views.console.ProposedCombinationView;

public class ProposalController extends Controller {

    private GameView gameview;

    public ProposalController(Session session) {
        super(session);
        this.gameview = new GameView();
    }

    public Error addProposedCombination(List<Color> colors) {
        Error error = null;
        if (colors.size() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    for (int j = i + 1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = Error.DUPLICATED;
                        }
                    }
                }
            }
        }
        if (error == null) {
            this.session.addProposedCombination(colors);
            if (this.session.isWinner() || this.session.isLooser()) {
                this.session.next();
            }
        }
        return error;
    }

    @Override
    public void control() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView().read();
            error = this.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        this.gameview.setAttempts(this.session.getAttempts());
        this.gameview.setWidth(this.getWidth());
        this.gameview.clearAllColors();
        this.gameview.clearAllResults();
        for (int i = 0; i < this.session.getAttempts(); i++) {
            this.gameview.setAllColors(this.session.getColors(i));
            this.gameview.setAllResults(this.session.getBlacks(i), this.session.getWhites(i));
        }
        this.gameview.writeGame();
        if (this.session.isWinner()) {
            this.gameview.writeWinner();
        } else if (this.session.isLooser()) {
            this.gameview.writeLooser();
        }
    }
}
