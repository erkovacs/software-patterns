public class JSONAPIOn implements Command {

    private Dispatcher dispatcher;

    public JSONAPIOn(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void execute() {
        dispatcher.setMimeType("application/json");
        dispatcher.startServer();
        dispatcher.setStatus(200);
        dispatcher.sendData();
    }
}
