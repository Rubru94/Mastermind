package mastermind_v3;

import mastermind_v3.controllers.Logic;
import mastermind_v3.controllers.implementation.LogicImplementation;
import mastermind_v3.models.DAO.SessionImplementationDAO;
import mastermind_v3.views.View;
import mastermind_v3.views.graphics.GraphicsView;

public class MastermindStandalone extends Mastermind {

    public static void main(String[] args) {
        new MastermindStandalone().play();
    }

    @Override
    protected Logic createLogic() {
        return new LogicImplementation(new SessionImplementationDAO());
    }

    @Override
    protected View createView() {
        return new GraphicsView();
    }

}
