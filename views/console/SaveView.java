package mastermind_v3.views.console;

import mastermind_v3.controllers.SaveController;
import mastermind_v3.utils.WithConsoleView;
import mastermind_v3.utils.YesNoDialog;
import mastermind_v3.views.MessageView;

public class SaveView extends WithConsoleView {

    void interact(SaveController saveController) {
        boolean save = new YesNoDialog().read(MessageView.SAVE.getMessage());
        String name = null;
        if (save) {
            if (saveController.hasName()) {
                saveController.save();
            } else {
                boolean exists = false;
                do {
                    name = this.console.readString(MessageView.NAME.getMessage());
                    exists = saveController.exists(name);
                    if (exists) {
                        this.console.writeln("The proposed name already exists");
                    }
                } while (exists);
                saveController.save(name);
            }
        }
        saveController.next();
    }

}
