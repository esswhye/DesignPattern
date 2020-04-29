package Command.Example.Command;

import Command.Example.Receiver.Receiver;

public class CopyCommand implements Command {

    private Receiver receiver;
    private String copiedData;

    public CopyCommand(Receiver receiver, String copiedData) {
        this.receiver = receiver;
        this.copiedData = copiedData;
    }

    @Override
    public void execute() {
        receiver.copy(copiedData);
    }

    @Override
    public void undo() {
        System.out.println("Undoing CopyCommand");
    }
}
