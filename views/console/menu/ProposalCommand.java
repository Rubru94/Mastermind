package mastermind_v3.views.console.menu;

import java.util.List;
import mastermind_v3.controllers.InGameController;
import mastermind_v3.types.Color;
import mastermind_v3.utils.Console;
import mastermind_v3.views.ErrorView;
import mastermind_v3.views.MessageView;
import mastermind_v3.views.console.ProposedCombinationView;
import mastermind_v3.types.Error;

public class ProposalCommand extends Command {

    private Console console;

    ProposalCommand(InGameController inGameController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), inGameController);
    }

    @Override
    protected void execute() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView((InGameController) this.acceptController).read();
            error = ((InGameController) this.acceptController).addProposedCombination(colors);
            if (error != null) {
                this.console.writeln(new ErrorView(error).getMessage());
            }
        } while (error != null);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
