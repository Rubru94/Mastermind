package mastermind_v4.types;

public enum Color {
    RED,
    BLUE,
    YELLOW,
    GREEN,
    ORANGE,
    PURPLE;

    public static int getLength() {
        return Color.values().length;
    }

}
