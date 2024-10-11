package wustemberg.gustavo.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class SaveCep {
    public void saveJson(Address address) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            FileWriter fileWriter = new FileWriter(address.cep() + ".json");
            fileWriter.write(gson.toJson(address));
            fileWriter.close();

            System.out.println(String.format("O resultado da sua busca foi salvo no arquivo %s.json", address.cep()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
