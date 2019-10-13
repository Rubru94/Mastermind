package mastermind_v3.views.console.menu;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.views.MessageView;

public class ExitCommand extends Command {

    protected ExitCommand(InGameController inGameController) {
        super(MessageView.EXIT.getMessage(), inGameController);
    }

    @Override
    public void execute() {
        ((InGameController) this.acceptController).next();
    }

    @Override
    public boolean isActive() {
        return true;
    }

}
