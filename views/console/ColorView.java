package mastermind_v3.views.console;

import mastermind_v3.types.Color;
import mastermind_v3.utils.Console;

class ColorView extends mastermind_v3.views.ColorView {

    ColorView(Color color) {
        super(color);
    }

    void write() {
        new Console().write(ColorView.INITIALS[this.color.ordinal()]);
    }

}
