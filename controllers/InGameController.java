package mastermind_v3.controllers;

import java.util.List;
import mastermind_v3.models.Session;
import mastermind_v3.types.Color;
import mastermind_v3.types.Error;

public abstract class InGameController extends AcceptController {

    protected InGameController(Session session) {
        super(session);
    }

    public abstract Error addProposedCombination(List<Color> colors);

    public abstract void undo();

    public abstract void redo();

    public abstract void next();

    public abstract boolean undoable();

    public abstract boolean redoable();

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    public abstract int getBlacks(int position);

    public abstract int getWhites(int position);

    public abstract int getAttempts();
    
    public abstract List<Color> getColors(int position);

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}
