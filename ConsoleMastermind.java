package mastermind_v3;

import mastermind_v3.controllers.Logic;
import mastermind_v3.controllers.implementation.LogicImplementation;
import mastermind_v3.models.DAO.SessionImplementationDAO;
import mastermind_v3.views.View;
import mastermind_v3.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

    @Override
    protected Logic createLogic() {
         return new LogicImplementation(new SessionImplementationDAO());
    }

}
