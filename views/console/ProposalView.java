package mastermind_v3.views.console;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.utils.WithConsoleView;
import mastermind_v3.views.console.menu.PlayMenu;

class ProposalView extends WithConsoleView {

    void interact(InGameController inGameController) {
        new PlayMenu(inGameController).execute();
    }

}
