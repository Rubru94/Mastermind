
package mastermind_v4.views.console;

import java.util.List;
import mastermind_v4.views.MessageView;

class ResultView {

    void writeln(List<Integer> results) {
        MessageView.RESULT.writeln(results.get(0), results.get(1));
    }

}
