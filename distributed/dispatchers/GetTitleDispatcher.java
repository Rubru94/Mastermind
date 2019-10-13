
package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.SaveControllerImplementation;

public class GetTitleDispatcher extends Dispatcher {

    public GetTitleDispatcher(SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(this.acceptController.getName());
    }

}
