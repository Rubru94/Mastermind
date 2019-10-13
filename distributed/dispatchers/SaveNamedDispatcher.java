
package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.SaveControllerImplementation;

public class SaveNamedDispatcher extends Dispatcher {

    public SaveNamedDispatcher(SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((SaveControllerImplementation) this.acceptController).save();
    }

}
