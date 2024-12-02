import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class APIConversor {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/56ef87de6edd55e8b8b7e8f7/latest/USD"))
            .build();

}
