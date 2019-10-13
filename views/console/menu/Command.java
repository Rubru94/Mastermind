package mastermind_v3.views.console.menu;

import mastermind_v3.controllers.AcceptController;

public abstract class Command extends mastermind_v3.utils.Command {

    protected AcceptController acceptController;

    protected Command(String title, AcceptController acceptController) {
        super(title);
        this.acceptController = acceptController;
    }

}
