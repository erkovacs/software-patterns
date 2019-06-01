public interface Dispatcher {
    public void startServer();
    public void stopServer();
    public void setMimeType(String mimeType);
    public void setStatus(int status);
    public void receiveIncomingData();
    public void sendData();
}
