package mastermind_v3.models.DAO;

import mastermind_v3.models.ProposedCombination;

public class ProposedCombinationDAO extends CombinationDAO {

    ProposedCombinationDAO(ProposedCombination proposedCombination) {
        super(proposedCombination);
    }

    ProposedCombination getProposedCombination() {
        return (ProposedCombination) this.combination;
    }

}
