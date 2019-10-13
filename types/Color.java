package mastermind_v3.types;

public enum Color {
    RED,
    BLUE,
    YELLOW,
    GREEN,
    ORANGE,
    PURPLE;

    public static int length() {
        return Color.values().length;
    }

}
