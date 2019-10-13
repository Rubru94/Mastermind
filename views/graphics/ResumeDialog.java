package mastermind_v3.views.graphics;

import javax.swing.JOptionPane;

import mastermind_v3.views.MessageView;

class ResumeDialog {

    private boolean newGame;

    ResumeDialog() {
        this.newGame = (JOptionPane.showConfirmDialog(null, MessageView.RESUME.getMessage(), MessageView.TITLE.getMessage(),
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }

    boolean isNewGame() {
        return this.newGame;
    }

}
