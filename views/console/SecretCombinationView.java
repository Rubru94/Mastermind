package mastermind_v3.views.console;

import mastermind_v3.controllers.Controller;
import mastermind_v3.views.MessageView;
import mastermind_v3.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    private Controller controller;

    SecretCombinationView(Controller controller) {
        super();
        this.controller = controller;
    }

    void writeln() {
        for (int i = 0; i < this.controller.getWidth(); i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }

}
