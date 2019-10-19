package mastermind_v4.views.console;

import mastermind_v4.views.MessageView;

public class StartView {

    public void write(int width) {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln(width);
    }

}
