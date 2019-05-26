import java.util.Random;

public class HTTPFetch {

    // Mock http client

    private String endpoint;
    private HTTPMethods method;
    private long timeout;

    public HTTPFetch(String endpoint, HTTPMethods method, long timeoutMillis){
        this.endpoint = endpoint;
        this.method = method;
        this.timeout = timeoutMillis;
    }

    public String execute(){
        Random random = new Random();
        return random.nextBoolean() ? "200 - OK" : "404 - Not Found";
    }
}
