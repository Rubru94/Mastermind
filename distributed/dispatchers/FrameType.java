package mastermind_v3.distributed.dispatchers;

public enum FrameType {
    START,
    STATE,
    COLORS,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    WINNER,
    LOOSER,
    ATTEMPTS,
    PROPOSECOMBINATION,
    WIDTH,
    BLACKS,
    WHITES,
    NEWGAME,
    HASNAME,
    EXISTS,
    SAVE,
    NEXT,
    CLOSE,
    STARTNAME,
    TITLES,
    GETTITLE,
    SETTITLE,
    SAVENAMED;

    public static FrameType parser(String string) {
        for (FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
