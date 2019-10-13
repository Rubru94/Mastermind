package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.SaveControllerImplementation;

public class SetTitleDispatcher extends Dispatcher {

    public SetTitleDispatcher(SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() {
        String title = this.tcpip.receiveLine();
        this.acceptController.setName(title);
    }

}
