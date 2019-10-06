package mastermind_v2;

import mastermind_v2.controllers.Controller;
import mastermind_v2.controllers.Logic;
import mastermind_v2.views.View;
import mastermind_v2.views.console.ConsoleView;

public class Mastermind_v2 {

    private Logic logic;
    private View view;

    protected Mastermind_v2() {

        this.logic = new Logic();
        this.view = new ConsoleView();
    }

    public void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            this.view.interact(controller);
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Mastermind_v2().play();
    }

}
