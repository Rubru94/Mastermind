package mastermind_v3.distributed;

import mastermind_v3.distributed.dispatchers.FrameType;
import mastermind_v3.models.Session;
import mastermind_v3.models.StateValue;
import mastermind_v3.utils.TCPIP;

public class SessionProxy implements Session {

    private TCPIP tcpip;

    public SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    @Override
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }

    @Override
    public int getWidth() {
        this.tcpip.send(FrameType.WIDTH.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public String getName() {
        this.tcpip.send(FrameType.GETTITLE.name());
        return this.tcpip.receiveLine();
    }

    @Override
    public void setName(String title) {
        this.tcpip.send(FrameType.SETTITLE.name());
        this.tcpip.send(title);
    }

}
