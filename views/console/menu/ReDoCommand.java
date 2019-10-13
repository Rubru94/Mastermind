package mastermind_v3.views.console.menu;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.views.MessageView;

public class ReDoCommand extends Command {

    public ReDoCommand(InGameController inGameController) {
        super(MessageView.REDO_COMMAND.getMessage(), inGameController);
    }

    @Override
    protected void execute() {
        ((InGameController) this.acceptController).redo();
    }

    @Override
    public boolean isActive() {
        return ((InGameController) this.acceptController).redoable();
    }
}
