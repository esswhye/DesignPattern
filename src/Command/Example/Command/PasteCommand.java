package Command.Example.Command;

import Command.Example.Receiver.Receiver;

public class PasteCommand implements Command {

    private Receiver receiver;

    private String preContent;

    public PasteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        preContent = receiver.getContent();
        receiver.paste();
    }

    @Override
    public void undo() {
        System.out.println("undoing pastecommand");
        receiver.setContent(preContent);
    }
}
