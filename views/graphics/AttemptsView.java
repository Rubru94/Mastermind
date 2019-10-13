package mastermind_v3.views.graphics;

import javax.swing.JLabel;

import mastermind_v3.views.MessageView;

@SuppressWarnings("serial")
class AttemptsView extends JLabel {

    AttemptsView(int attempts) {
        this.setText(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + (attempts)));
    }

}
