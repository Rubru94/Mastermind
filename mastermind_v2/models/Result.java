package mastermind_v2.models;

import mastermind_v2.views.console.Message;

public class Result {

    private int blacks = 0;

    private int whites = 0;

    Result(int blacks, int whites) {
        assert blacks >= 0;
        assert whites >= 0;
        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean isWinner() {
        return this.blacks == Combination.getWidth();
    }

    public void writeln() {
        Message.RESULT.writeln(this.blacks, this.whites);
    }
}
