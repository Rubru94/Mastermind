package mastermind_v3.distributed;

import mastermind_v3.controllers.implementation.LogicImplementation;
import mastermind_v3.distributed.dispatchers.*;
import mastermind_v3.models.DAO.SessionImplementationDAO;

public class LogicImplementationServer extends LogicImplementation {

    public LogicImplementationServer(SessionImplementationDAO sessionImplementationDAO) {
        super(sessionImplementationDAO);
    }

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.NEWGAME, new ResumeDispatcher(this.resumeControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.COLORS, new ColorsDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.WIDTH, new WidthDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.PROPOSECOMBINATION, new ProposeCombinationDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.STARTNAME, new StartNameDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.TITLES, new TitlesDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.NEXT, new NextDispatcher(this.inGameControllerImplementation));
        dispatcherPrototype.add(FrameType.SAVE, new SaveDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.SAVENAMED, new SaveNamedDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.HASNAME, new HasNameDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.EXISTS, new ExistsDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.GETTITLE, new GetTitleDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.SETTITLE, new SetTitleDispatcher(this.saveControllerImplementation));
    }

}
