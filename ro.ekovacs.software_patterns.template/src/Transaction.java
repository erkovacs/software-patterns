public abstract class Transaction {

    public abstract void defineQuery();
    public abstract void parseParameters();
    public abstract void validateQuery();
    public abstract void runQuery();
    public abstract void returnResults();

    public final void commit(){
        defineQuery();
        parseParameters();
        validateQuery();
        runQuery();
        returnResults();
    }
}
