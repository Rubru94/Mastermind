package mastermind_v3.views.console;

import java.util.ArrayList;
import java.util.List;
import mastermind_v3.controllers.InGameController;

import mastermind_v3.types.Color;
import mastermind_v3.utils.WithConsoleView;
import mastermind_v3.views.MessageView;

public class ProposedCombinationView extends WithConsoleView {

    private final InGameController inGameController;

    public ProposedCombinationView(InGameController inGameController) {
        this.inGameController = inGameController;
    }

    void write(int position) {
        for (Color color : this.inGameController.getColors(position)) {
            new ColorView(color).write();
        }
    }

    public List<Color> read() {
        String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < characters.length(); i++) {
            colors.add(ColorView.getInstance(characters.charAt(i)));
        }
        return colors;
    }

}
