package mastermind_v4.views.console;

import mastermind_v4.utils.YesNoDialog;
import mastermind_v4.views.MessageView;

public class ResumeView {

    public boolean write() {
        return new YesNoDialog().read(MessageView.RESUME.getMessage());
    }

}
