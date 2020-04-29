package Command.Example.Command;

import Command.Example.Receiver.Notepad;
import Command.Example.Receiver.Receiver;

public class CutCommand implements Command {

    private Receiver receiver;
    private int start, end;
    private String preContent;

    public CutCommand(Receiver receiver, int start, int end) {
        this.receiver = receiver;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        preContent = receiver.getContent().substring(start, end);
        this.receiver.cut(start, end);
    }

    @Override
    public void undo() {
        System.out.println("Undoing CutCommand");
        ((Notepad) receiver).insert(preContent, start);
        //execute();
    }
}
