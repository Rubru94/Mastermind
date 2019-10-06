package mastermind_v2.views.console;

import mastermind_v2.controllers.Controller;
import mastermind_v2.models.Combination;

public class SecretCombinationView {

    private Controller controller;
    
    public SecretCombinationView(Controller controller) {
        this.controller = controller;
    }

    public void writeln() {
        for (int i = 0; i < Combination.getWidth(); i++) {
            Message.SECRET.write();
        }
        Message.NEW_LINE.write();
    }
}
