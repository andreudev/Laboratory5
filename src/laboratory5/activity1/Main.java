package laboratory5.activity1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Cliente> clientes =  listOfClients();
        Banco banco = new Banco();


        for (Cliente cliente : clientes) {
            banco.addCliente(cliente);
        }

        banco.atender();
    }


    public static List<Cliente> listOfClients() {
        return Arrays.asList(
                new Cliente("Juan", "CAJA", "NORMAL", 5),
                new Cliente("Maria", "PLATAFORMA", "GESTANTE", 10),
                new Cliente("Pedro", "CAJA", "DISCAPACITADO", 3),
                new Cliente("Jose", "PLATAFORMA", "ADULTOMAYOR", 7),
                new Cliente("Ana", "CAJA", "NORMAL", 2),
                new Cliente("Luis", "PLATAFORMA", "GESTANTE", 8),
                new Cliente("Carlos", "CAJA", "DISCAPACITADO", 4),
                new Cliente("Sofia", "PLATAFORMA", "ADULTOMAYOR", 6)
        );
    }
}
