package mastermind_v3.distributed;

import mastermind_v3.Mastermind;
import mastermind_v3.controllers.Logic;
import mastermind_v3.views.View;

public class MastermindClient extends Mastermind {

    private LogicProxy logicProxy;

    @Override
    protected Logic createLogic() {
        this.logicProxy = new LogicProxy();
        return this.logicProxy;
    }

    @Override
    protected void play() {
        super.play();
        this.logicProxy.close();
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }

    @Override
    protected View createView() {
        return null;   
    }

}
