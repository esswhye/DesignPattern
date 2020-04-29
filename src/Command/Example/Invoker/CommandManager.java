package Command.Example.Invoker;

import Command.Example.Command.Command;

import java.util.Stack;

public class CommandManager {

    private Stack<Command> commandStack;

    public CommandManager() {
        this.commandStack = new Stack<>();
    }

    public void setCommand(Command command) {
        commandStack.push(command);
       // System.out.println(command.getClass().getSimpleName() + " added to stack");
    }

    public void execute() {
        commandStack.peek().execute();
    }

    public void undo() {
        if (!commandStack.empty()) {
            commandStack.pop().undo();
        } else
            System.out.println("Nothing to Undo");
    }

}
