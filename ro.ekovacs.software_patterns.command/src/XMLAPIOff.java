public class XMLAPIOff implements Command {

    private Dispatcher dispatcher;

    public XMLAPIOff(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void execute() {
        dispatcher.setMimeType("application/xml");
        dispatcher.stopServer();
    }
}
