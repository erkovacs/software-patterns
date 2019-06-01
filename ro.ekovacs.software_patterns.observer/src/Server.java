import java.util.ArrayList;

public class Server implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int port;

    public Server(int port){
        this.port = port;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        final String mockRequest = "GET /users/121 HTTP/1.1\n" +
                "User-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)\n" +
                "Host: www.tutorialspoint.com\n" +
                "Accept-Language: en-us\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Connection: Keep-Alive";
        for(Observer observer : observers){
            observer.update(mockRequest);
        }
    }
}
