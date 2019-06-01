public class RESTAPIDispatcher implements Dispatcher {

    private String mimeType;
    private int status;

    @Override
    public void startServer() {
        System.out.println("Server started");
    }

    @Override
    public void stopServer() {
        System.out.println("Server stopped");
    }

    @Override
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
        System.out.println("MIME Type set to " + mimeType);
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
        System.out.println("Status code set to " + status);
    }

    @Override
    public void receiveIncomingData() {
        System.out.println("Receiving incoming data...");
    }

    @Override
    public void sendData() {
        System.out.println("Sending data...");
    }
}
