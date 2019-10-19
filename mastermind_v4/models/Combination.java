package mastermind_v4.models;

import java.util.ArrayList;
import java.util.List;

import mastermind_v4.types.Color;

public abstract class Combination {

    private static final int WIDTH = 4;

    protected List<Color> colors;

    protected Combination() {
        this.colors = new ArrayList<>();
    }

    public static int getWidth() {
        return Combination.WIDTH;
    }

}
