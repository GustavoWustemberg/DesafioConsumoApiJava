package wustemberg.gustavo.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetCep {
    private String cep;

    public Address getCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Address.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP.");
        }
    }
}
