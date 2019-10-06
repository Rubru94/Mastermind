package mastermind_v2.views.console;

import mastermind_v2.controllers.Controller;
import mastermind_v2.models.Color;
import mastermind_v2.models.Combination;
import mastermind_v2.utils.IO;
import mastermind_v2.models.Error;
import mastermind_v2.models.ProposedCombination;

public class ProposedCombinationView {

    private Controller controller;

    ProposedCombination proposedCombination;

    public ProposedCombinationView(Controller controller) {
        this.controller = controller;
        this.proposedCombination = controller.proposedCombination;
    }

    public void write() {
        for (Color color : Color.values()) {
            color.write();
        }
    }

    public void read() {
        Error error;
        do {
            error = null;
            Message.PROPOSED_COMBINATION.write();
            String characters = IO.readString();
            if (characters.length() != Combination.getWidth()) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = Color.getInstance(characters.charAt(i));
                    if (color == null) {
                        error = Error.WRONG_CHARACTERS;
                    } else {
                        for (int j = 0; j < this.proposedCombination.colors.size(); j++) {
                            if (color == this.proposedCombination.colors.get(j)) {
                                error = Error.DUPLICATED;
                            }
                        }
                        this.proposedCombination.colors.add(color);
                    }
                }
            }
            if (error != null) {
                error.writeln();
                while (!this.proposedCombination.colors.isEmpty()) {
                    this.proposedCombination.colors.remove(0);
                }
            }
        } while (error != null);
    }

    public boolean contains(Color color, int position) {
        return this.proposedCombination.colors.get(position) == color;
    }

    public boolean contains(Color color) {
        for (int i = 0; i < this.proposedCombination.colors.size(); i++) {
            if (this.proposedCombination.colors.get(i) == color) {
                return true;
            }
        }
        return false;
    }
}
