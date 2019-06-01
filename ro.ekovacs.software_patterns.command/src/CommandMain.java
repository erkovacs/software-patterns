public class CommandMain {
    public static void main(String[] args){
        Dispatcher invoker = new RESTAPIDispatcher();
        ServerController serverController = new ServerController();
        serverController.addRequest(new JSONAPIOn(invoker));
        serverController.addRequest(new XMLAPIOff(invoker));
        serverController.dispatchRequests();
    }
}
