package mastermind_v4.views.console;

import java.util.ArrayList;
import java.util.List;
import mastermind_v4.types.Color;
import mastermind_v4.utils.WithConsoleView;
import mastermind_v4.views.ColorView;
import mastermind_v4.views.MessageView;

public class ProposedCombinationView extends WithConsoleView {

    void write(List<Color> colors) {
        for (Color color : colors) {
            new ColorView(color).write();
        }
    }

    public List<Color> read() {
        String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
        List<Color> colors = new ArrayList<>();
        for (int i = 0; i < characters.length(); i++) {
            colors.add(ColorView.getInstance(characters.charAt(i)));
        }
        return colors;
    }

}
