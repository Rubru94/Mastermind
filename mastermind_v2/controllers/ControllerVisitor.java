package mastermind_v2.controllers;

public interface ControllerVisitor {

    void visit(StartController startController);

    void visit(ProposedCombinationController proposedCombinationController);

    void visit(ResumeController resumeController);
}
