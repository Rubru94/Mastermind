package mastermind_v3.views.graphics;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.controllers.ProposalController;
import mastermind_v3.controllers.ResumeController;
import mastermind_v3.controllers.SaveController;
import mastermind_v3.controllers.StartController;
import mastermind_v3.views.View;

public class GraphicsView extends View {

    private GameView gameView;

    public GraphicsView() {
        this.gameView = new GameView();
    }

    @Override
    public void visit(StartController startController) {
        this.gameView.interact(startController);
    }

    
    public void visit(ProposalController proposalController) {
        this.gameView.interact(proposalController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        ResumeDialog resumeDialog = new ResumeDialog();
        resumeController.resume(resumeDialog.isNewGame());
        if (resumeDialog.isNewGame()) {
            this.gameView = new GameView();
        } else {
            this.gameView.setVisible(false);
            System.exit(0);
        }
    }

    @Override
    public void visit(InGameController inGameController) {
    }

    @Override
    public void visit(SaveController saveController) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
