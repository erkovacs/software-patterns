public class HTTPFetchAdapter implements RESTClient {

    // Adapt the class to the API specified in REST Client
    private HTTPFetch httpFetch = null;
    private static final long TIMEOUT_MILLIS = 5000;
    private static final String HTTP_OK = "200 - OK";

    @Override
    public int get(String url) {
        httpFetch = new HTTPFetch(url, HTTPMethods.GET, TIMEOUT_MILLIS);
        String httpStatus = httpFetch.execute();
        return HTTP_OK.equals(httpStatus) ? 200 : 500;
    }

    @Override
    public int post(String url) {
        httpFetch = new HTTPFetch(url, HTTPMethods.POST, TIMEOUT_MILLIS);
        String httpStatus = httpFetch.execute();
        return HTTP_OK.equals(httpStatus) ? 200 : 500;
    }

    @Override
    public int put(String url) {
        httpFetch = new HTTPFetch(url, HTTPMethods.PUT, TIMEOUT_MILLIS);
        String httpStatus = httpFetch.execute();
        return HTTP_OK.equals(httpStatus) ? 200 : 500;
    }

    @Override
    public int patch(String url) {
        httpFetch = new HTTPFetch(url, HTTPMethods.PATCH, TIMEOUT_MILLIS);
        String httpStatus = httpFetch.execute();
        return HTTP_OK.equals(httpStatus) ? 200 : 500;
    }

    @Override
    public int delete(String url) {
        httpFetch = new HTTPFetch(url, HTTPMethods.DELETE, TIMEOUT_MILLIS);
        String httpStatus = httpFetch.execute();
        return HTTP_OK.equals(httpStatus) ? 200 : 500;
    }
}
