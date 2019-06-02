public class TemplateMain {
    public static void main(String[] args){
        HTTPTransaction httpTransaction = new HTTPTransaction();
        SQLTransaction sqlTransaction = new SQLTransaction();
        httpTransaction.commit();
        sqlTransaction.commit();
    }
}
