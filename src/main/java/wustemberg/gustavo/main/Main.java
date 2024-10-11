package wustemberg.gustavo.main;
import wustemberg.gustavo.models.Address;
import wustemberg.gustavo.models.GetCep;
import wustemberg.gustavo.models.SaveCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GetCep cep = new GetCep();
        SaveCep saveCep = new SaveCep();

        System.out.println("Informe o cep que deseja buscar: ");
        Address newAddress = cep.getCep(scanner.nextLine());

        System.out.println(newAddress);
        saveCep.saveJson(newAddress);

    }
}