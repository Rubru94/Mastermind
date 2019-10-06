package mastermind_v2.utils;

public class YesNoDialog {

    private static final char AFIRMATIVE = 'y';

    private static final char NEGATIVE = 'n';

    private static final String QUESTION = "? (" + YesNoDialog.AFIRMATIVE + "/" + YesNoDialog.NEGATIVE + "): ";

    private static final String MESSAGE = "The value must be '" + YesNoDialog.AFIRMATIVE + "' or '"
            + YesNoDialog.NEGATIVE + "'";

    public boolean read() {
        char answer;
        boolean ok;
        do {
            answer = IO.readChar(YesNoDialog.QUESTION);
            ok = YesNoDialog.isAfirmative(answer) || YesNoDialog.isNegative(answer);

            if (!ok) {
                IO.writeln(YesNoDialog.MESSAGE);
            }
        } while (!ok);
        if (answer == NEGATIVE) {
            return false;
        }
        return YesNoDialog.isAfirmative(answer);
    }

    private static boolean isAfirmative(char answer) {
        return Character.toLowerCase(answer) == YesNoDialog.AFIRMATIVE;
    }

    private static boolean isNegative(char answer) {
        return Character.toLowerCase(answer) == YesNoDialog.NEGATIVE;
    }
}
