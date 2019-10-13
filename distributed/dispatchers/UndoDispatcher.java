package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.InGameControllerImplementation;

public class UndoDispatcher extends Dispatcher {

    public UndoDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((InGameControllerImplementation) this.acceptController).undo();
    }

}
