package root.design.command;

public class RemoteController
{
    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public RemoteController()
    {
        onCommands = new Command[5];
        offCommands = new Command[5];
        undoCommand = new NoCommand();

        for(int i=0;i<5;i++)
        {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int no, Command onCommand, Command offCommand)
    {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void callOnCommand(int no)
    {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void callOffCommand(int no)
    {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void callUndoCommand()
    {
        undoCommand.undo();
    }

}
