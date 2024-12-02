import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class API {

    private static final String chaveApi = "56ef87de6edd55e8b8b7e8f7";

    public String chamarApi(String moedas) throws IOException, InterruptedException {
        var endereco = "https://v6.exchangerate-api.com/v6/" + chaveApi + "/latest/" + moedas.toUpperCase();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}