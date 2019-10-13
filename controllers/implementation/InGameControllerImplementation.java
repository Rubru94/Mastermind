package mastermind_v3.controllers.implementation;

import java.util.List;
import mastermind_v3.controllers.ExitController;
import mastermind_v3.controllers.InGameController;
import mastermind_v3.controllers.ProposalController;
import mastermind_v3.controllers.UnDoController;
import mastermind_v3.controllers.ReDoController;
import mastermind_v3.models.Session;
import mastermind_v3.types.Color;
import mastermind_v3.types.Error;

public class InGameControllerImplementation extends InGameController {

    private ProposalController proposalController;

    private UnDoController undoController;

    private ReDoController redoController;

    private ExitController exitController;

    public InGameControllerImplementation(Session session) {
        super(session);
        this.proposalController = new ProposalController(this.session);
        this.undoController = new UnDoController(this.session);
        this.redoController = new ReDoController(this.session);
        this.exitController = new ExitController(this.session);
    }

    @Override
    public Error addProposedCombination(List<Color> colors) {
        return this.proposalController.addProposedCombination(colors);
    }

    @Override
    public void undo() {
        this.undoController.undo();
    }

    @Override
    public void redo() {
        this.redoController.redo();
    }

    @Override
    public boolean undoable() {
        return this.undoController.undoable();
    }

    @Override
    public boolean redoable() {
        return this.redoController.redoable();
    }

    @Override
    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    @Override
    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    @Override
    public List<Color> getColors(int position) {
        return this.proposalController.getColors(position);
    }

    @Override
    public int getBlacks(int position) {
        return this.proposalController.getBlacks(position);
    }

    @Override
    public int getWhites(int position) {
        return this.proposalController.getWhites(position);
    }

    @Override
    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    @Override
    public void next() {
        this.exitController.next();
    }

}
