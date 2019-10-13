package mastermind_v3.views.console;

import mastermind_v3.controllers.AcceptController;
import mastermind_v3.controllers.InGameController;
import mastermind_v3.controllers.ResumeController;
import mastermind_v3.controllers.SaveController;
import mastermind_v3.controllers.StartController;
import mastermind_v3.views.View;

public class ConsoleView extends View {

    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;
    
    private SaveView saveView;
    
    public ConsoleView() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    @Override
    public void visit(InGameController inGameController) {
        this.proposalView.interact(inGameController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
    
    @Override
    public void visit(SaveController saveController) {
        this.saveView.interact(saveController);
    }

    @Override
    public void interact(AcceptController acceptorController) {
        acceptorController.accept(this);
    }

}
