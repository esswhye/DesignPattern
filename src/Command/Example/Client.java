package Command.Example;

import Command.Example.Command.Command;
import Command.Example.Command.CopyCommand;
import Command.Example.Command.CutCommand;
import Command.Example.Command.PasteCommand;
import Command.Example.Invoker.CommandManager;
import Command.Example.Receiver.Notepad;
import Command.Example.Receiver.Receiver;

public class Client {


    public static void main(String[] args) {

        Receiver notepad = new Notepad("This is a notepad. ");
        CommandManager commandManager = new CommandManager();

        Command copyCommand = new CopyCommand(notepad, "Hello ");
        commandManager.setCommand(copyCommand);
        commandManager.execute();

        Command pasteCommand = new PasteCommand(notepad);
        commandManager.setCommand(pasteCommand);
        commandManager.execute();

        Command pasteCommand2 = new PasteCommand(notepad);
        commandManager.setCommand(pasteCommand2);
        commandManager.execute();

        System.out.println(notepad.getContent());

        Command cutCommand = new CutCommand(notepad, 0, 5);
        commandManager.setCommand(cutCommand);
        commandManager.execute();

        Command pasteCommand3 = new PasteCommand(notepad);
        commandManager.setCommand(pasteCommand3);
        commandManager.execute();

        System.out.println(notepad.getContent());

        commandManager.undo();
        System.out.println(notepad.getContent());

        commandManager.undo();
        System.out.println(notepad.getContent());

        commandManager.undo();
        System.out.println(notepad.getContent());

        commandManager.undo();
        System.out.println(notepad.getContent());

    }
}
