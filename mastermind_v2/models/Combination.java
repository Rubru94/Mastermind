package mastermind_v2.models;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    private static final int WIDTH = 4;

    public List<Color> colors;

    public Combination() {
        this.colors = new ArrayList<Color>();
    }

    public static int getWidth() {
        return Combination.WIDTH;
    }

    public List<Color> getColors() {
        return this.colors;
    }
    
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }
}
