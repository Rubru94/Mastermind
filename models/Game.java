package mastermind_v3.models;

import java.util.ArrayList;
import java.util.List;

import mastermind_v3.types.Color;

public class Game {

    private static final int MAX_LONG = 10;

    private SecretCombination secretCombination;

    private List<ProposedCombination> proposedCombinations;

    private List<Result> results;

    private int attempts;

    public Game() {
        this.clear();
    }

    public void clear() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
        this.attempts = 0;
    }

    public void addProposedCombination(List<Color> colors) {
        ProposedCombination proposedCombination = new ProposedCombination(colors);
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
        this.attempts++;
    }

    Memento createMemento() {
        Memento memento = new Memento(this.attempts);
        for (int i = 0; i < this.proposedCombinations.size(); i++) {
            memento.set(this.proposedCombinations.get(i).copy(), this.results.get(i).copy());
        }
        return memento;
    }

    void set(Memento memento) {
        this.attempts = memento.getAttempts();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.results = new ArrayList<Result>();
        for (int i = 0; i < memento.getSize(); i++) {
            this.proposedCombinations.add(memento.getProposedCombination(i).copy());
            this.results.add(memento.getResult(i).copy());
        }
    }

    public int getAttempts() {
        return this.attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean isWinner() {
        return this.results.get(this.attempts - 1).isWinner();
    }

    public boolean isLooser() {
        return this.attempts == Game.MAX_LONG;
    }

    public List<Color> getColors(int position) {
        return this.proposedCombinations.get(position).colors;
    }

    public int getBlacks(int position) {
        return this.results.get(position).getBlacks();
    }

    public int getWhites(int position) {
        return this.results.get(position).getWhites();
    }

    public int getWidth() {
        return Combination.getWidth();
    }

    public Result getResult(int position) {
        return this.results.get(position);
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposedCombinations.get(position);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations.add(proposedCombination);
    }

    public void addResult(Result result) {
        this.results.add(result);
    }

    public SecretCombination getSecretCombination() {
        return this.secretCombination;
    }
}
