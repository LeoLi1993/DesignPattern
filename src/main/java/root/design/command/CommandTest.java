package root.design.command;

public class CommandTest
{

    public static void main(String[] args)
    {
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommands(0, lightOnCommand, lightOffCommand);

        remoteController.callOnCommand(0);
        remoteController.callOffCommand(0);
        remoteController.callUndoCommand();
        System.out.println("********************************");
        remoteController.callOffCommand(0);
        remoteController.callOnCommand(0);
        remoteController.callUndoCommand();
    }
}
