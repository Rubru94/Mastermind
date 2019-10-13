package mastermind_v3.views.console;

import mastermind_v3.controllers.ResumeController;
import mastermind_v3.views.MessageView;
import mastermind_v3.utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
    }

}
