package mastermind_v3.distributed;

import mastermind_v3.controllers.ResumeController;
import mastermind_v3.distributed.dispatchers.FrameType;
import mastermind_v3.distributed.dispatchers.TCPIP;
import mastermind_v3.models.Session;

public class ResumeControllerProxy extends ResumeController {

    private TCPIP tcpip;

    public ResumeControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void resume(boolean newGame) {
        this.tcpip.send(FrameType.NEWGAME.name());
        this.tcpip.send(newGame);
    }

}
