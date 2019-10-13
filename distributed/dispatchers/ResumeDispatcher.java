package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.ResumeControllerImplementation;

public class ResumeDispatcher extends Dispatcher {

    public ResumeDispatcher(ResumeControllerImplementation resumeControllerImplementation) {
        super(resumeControllerImplementation);
    }

    @Override
    public void dispatch() {
        boolean newGame = this.tcpip.receiveBoolean();
        ((ResumeControllerImplementation) this.acceptController).resume(newGame);
    }

}
