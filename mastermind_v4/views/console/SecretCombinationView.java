package mastermind_v4.views.console;

import mastermind_v4.views.MessageView;

public class SecretCombinationView{

    public void writeln(int length) {
        for (int i = 0; i < length; i++) {
            MessageView.SECRET.write();
        }
        MessageView.NEW_LINE.writeln();
    }
}
