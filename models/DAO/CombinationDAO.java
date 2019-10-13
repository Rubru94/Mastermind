package mastermind_v3.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import mastermind_v3.models.Combination;
import mastermind_v3.types.Color;

public abstract class CombinationDAO implements DAO {

    protected Combination combination;

    CombinationDAO(Combination combination) {
        this.combination = combination;
    }

    public void save(FileWriter fileWriter) {
        try {
            for (Color color : this.combination.getColors()) {
                fileWriter.write(color.name() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(BufferedReader bufferedReader) {
        try {
            for (int i = 0; i < Combination.getWidth(); i++) {
                String color = bufferedReader.readLine();
                this.combination.addColor(Color.valueOf(color));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
