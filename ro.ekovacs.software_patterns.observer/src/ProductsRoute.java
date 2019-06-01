public class ProductsRoute implements Observer {
    private final static String route = "/products";

    @Override
    public void update(String update) {
        if(update.contains("GET") && update.contains(route)){
            System.out.println("HTTP GET to route /products");
        } else {
            System.out.println("Update was a no-op");
        }
    }
}
