public class ObserverMain {
    public static void main(String[] args){
        System.out.println("Starting server...");
        Server server = new Server(8080);
        server.register(new UsersRoute());
        server.register(new ProductsRoute());
        server.register(new Observer() {
            @Override
            public void update(String update) {
                // We can now add middleware like this, pretty cool
                System.out.println("The full request is: ");
                System.out.println(update);
            }
        });
        server.notifyObserver();
    }
}
