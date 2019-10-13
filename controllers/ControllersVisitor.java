package mastermind_v3.controllers;

public interface ControllersVisitor {

    void visit(StartController startController);

    void visit(ResumeController resumeController);
    
    void visit(InGameController inGameController);
    
    void visit(SaveController saveController);
}
