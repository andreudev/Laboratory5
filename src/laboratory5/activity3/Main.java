package laboratory5.activity3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plaza plaza = new Plaza();
        listOfClients().forEach(plaza::addCliente);
        plaza.atender();

    }

    public static List<Cliente> listOfClients() {
        return Arrays.asList(
            new Cliente("Juan", "PIZZA"),
            new Cliente("Pedro", "CAFES"),
            new Cliente("Maria", "HELADO"),
            new Cliente("Jose", "PIZZA"),
            new Cliente("Ana", "CAFES")
        );
    }
}
