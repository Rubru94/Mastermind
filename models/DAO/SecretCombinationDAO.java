package mastermind_v3.models.DAO;

import java.io.BufferedReader;
import mastermind_v3.models.SecretCombination;

public class SecretCombinationDAO extends CombinationDAO {

    SecretCombinationDAO(SecretCombination secretCombination) {
        super(secretCombination);
    }

    public void load(BufferedReader bufferedReader) {
        this.combination.clearColors();
        super.load(bufferedReader);
    }

}
