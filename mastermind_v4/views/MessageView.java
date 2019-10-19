package mastermind_v4.views;

import mastermind_v4.utils.Console;

public enum MessageView {
    ATTEMPTS("#attempts attempt(s): "),
    SECRET("*"),
    RESUME("Do you want to continue"),
    RESULT(" --> #blacks blacks and #whites whites"),
    PROPOSED_COMBINATION("Propose a combination: "),
    TITLE("----- MASTERMIND -----"),
    WINNER("You've won!!! ;-)"),
    LOOSER("You've lost!!! :-("),
    NEW_LINE("");

    private String message;
    private Console console;

    private MessageView(String message) {
        this.message = message;
        this.console = new Console();
    }

    public String getMessage() {
        return this.message;
    }

    public void writeln() {
        this.console.writeln(this.message);
    }

    public void write() {
        this.console.write(this.message);
    }

    public void writeln(int attempts) {
        this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
    }

    public void writeln(int blacks, int whites) {
        this.console.writeln(this.message.replaceAll("#blacks", "" + blacks).replaceAll("#whites", "" + whites));
    }
}
