public class HTTPTransaction extends Transaction {
        @Override
        public void defineQuery() {
            System.out.println("HTTP query string defined");
        }

        @Override
        public void parseParameters() {
            System.out.println("URL params parsed");
        }

        @Override
        public void validateQuery() {
            System.out.println("Validation passed");
        }

        @Override
        public void runQuery() {
            System.out.println("Request ran");
        }

        @Override
        public void returnResults() {
            System.out.println("Response returned");
        }
    }

