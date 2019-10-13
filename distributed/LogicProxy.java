package mastermind_v3.distributed;

import mastermind_v3.controllers.Logic;
import mastermind_v3.distributed.dispatchers.TCPIP;
import mastermind_v3.models.StateValue;

public class LogicProxy extends Logic {

    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.acceptControllers.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.acceptControllers.put(StateValue.IN_GAME, new InGameControllerProxy(this.session, this.tcpip));
        this.acceptControllers.put(StateValue.SAVING, new SaveControllerProxy(this.session, this.tcpip));
        this.acceptControllers.put(StateValue.FINAL, new ResumeControllerProxy(this.session, this.tcpip));
        this.acceptControllers.put(StateValue.EXIT, null);
    }

    public void close() {
        this.tcpip.close();
    }

}
