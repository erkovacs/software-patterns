public interface RESTClient {
    public int get(String url);
    public int post(String url);
    public int put(String url);
    public int patch(String url);
    public int delete(String url);
}
