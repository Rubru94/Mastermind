package mastermind_v3.views;

import mastermind_v3.types.Error;

public class ErrorView {

    public static final String[] MESSAGES = {
        "Repeated colors",
        "Wrong colors, they must be: " + ColorView.allInitials(),
        "Wrong proposed combination length"};

    protected Error error;

    public ErrorView(Error error) {
        this.error = error;
    }

    public ErrorView(java.lang.Error error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMessage() {
        return ErrorView.MESSAGES[this.error.ordinal()];
    }

}
