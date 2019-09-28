
public class Combination {
    
    public enum Color {
        r, b, y, g, o, p
    }

    public Color[] colors = Color.values();

    public String colorsToString() {

        String enumString = "";

        for (Color c : Color.values()) {
            enumString += c.toString();
        }

        return enumString;
    }
}
