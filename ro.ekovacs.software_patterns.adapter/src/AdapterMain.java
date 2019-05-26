public class AdapterMain {
    public static void main(String[] args){
        HTTPFetchAdapter client = new HTTPFetchAdapter();
        int status = client.get("http://example.com/api/users/231");
        if(status == 200){
            System.out.println("User #231 exists!");
        } else {
            System.out.println("User #231 does not exist.");
        }
    }
}
