public class SQLTransaction extends Transaction {
    @Override
    public void defineQuery() {
        System.out.println("SQL query defined");
    }

    @Override
    public void parseParameters() {
        System.out.println("Parameterised SQL query prepared");
    }

    @Override
    public void validateQuery() {
        System.out.println("Validation passed");
    }

    @Override
    public void runQuery() {
        System.out.println("Query ran");
    }

    @Override
    public void returnResults() {
        System.out.println("Results returned");
    }
}
