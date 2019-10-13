package mastermind_v3.distributed.dispatchers;

import java.util.ArrayList;
import java.util.List;
import mastermind_v3.controllers.implementation.InGameControllerImplementation;
import mastermind_v3.types.Color;

public class ProposeCombinationDispatcher extends Dispatcher {

    public ProposeCombinationDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        int length = this.tcpip.receiveInt();
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < length; i++) {
            colors.add(this.tcpip.receiveColor());
        }
        this.tcpip.send(((InGameControllerImplementation) this.acceptController).addProposedCombination(colors));
    }

}
