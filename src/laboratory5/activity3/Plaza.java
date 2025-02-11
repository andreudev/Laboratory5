package laboratory5.activity3;

import java.util.LinkedList;
import java.util.Queue;

public class Plaza {
    private final Queue<Cliente> clientes = new LinkedList<>();

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void atender() {
        while (!clientes.isEmpty()) {
            Cliente cliente = clientes.poll();
            cliente.setEstado(Estado.SERVIDO);
            System.out.println(cliente.getNombre() + " ha sido atendido");
        }
    }



}
