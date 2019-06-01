import java.util.ArrayList;

public class ServerController {

    public ArrayList<Command> requests = new ArrayList<>();

    public void addRequest(Command request){
        requests.add(request);
    }

    public void dispatchRequests(){
        for(Command request : requests) {
            request.execute();
        }
        this.requests.clear();
    }

}
