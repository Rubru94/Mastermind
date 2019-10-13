package mastermind_v3.models;

public interface Session {

    StateValue getValueState();

    int getWidth();
    
    String getName();

    void setName(String title);

}
