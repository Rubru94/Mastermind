package mastermind_v3.views.console.menu;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.utils.Menu;

public class PlayMenu extends Menu {

    public PlayMenu(InGameController inGameController) {
        this.addCommand(new ProposalCommand(inGameController));
        this.addCommand(new UnDoCommand(inGameController));
        this.addCommand(new ReDoCommand(inGameController));
        this.addCommand(new ExitCommand(inGameController));
    }

}
