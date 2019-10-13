package mastermind_v3.distributed.dispatchers;

import java.util.List;
import mastermind_v3.controllers.implementation.InGameControllerImplementation;
import mastermind_v3.types.Color;

public class ColorsDispatcher extends Dispatcher {

    public ColorsDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        int position = this.tcpip.receiveInt();
        List<Color> colors = ((InGameControllerImplementation) this.acceptController).getColors(position);
        this.tcpip.send(colors.size());
        for (Color color : colors) {
            this.tcpip.send(color);
        }
    }

}
