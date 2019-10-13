package mastermind_v3.views.console.menu;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.views.MessageView;

public class UnDoCommand extends Command {

    public UnDoCommand(InGameController inGameController) {
        super(MessageView.UNDO_COMMAND.getMessage(), inGameController);
    }

    @Override
    protected void execute() {
        ((InGameController) this.acceptController).undo();
    }

    @Override
    public boolean isActive() {
        return ((InGameController) this.acceptController).undoable();
    }
}
