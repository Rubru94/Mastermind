package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.AcceptController;

public abstract class Dispatcher {

    protected AcceptController acceptController;

    protected TCPIP tcpip;

    public Dispatcher(AcceptController acceptorController) {
        this.acceptController = acceptorController;
    }

    public abstract void dispatch();

    public void associate(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

}
