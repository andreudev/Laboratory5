package laboratory5.activity1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Banco {
    private final Queue<Cliente> caja1 = new PriorityQueue<>(new ClienteComparator());
    private final Queue<Cliente> caja2 = new PriorityQueue<>(new ClienteComparator());
    private final Queue<Cliente> plataforma = new PriorityQueue<>(new ClienteComparator());

    public void addCliente(Cliente cliente) {
        switch (cliente.getServicio()) {
            case CAJA:
                if (caja1.size() <= caja2.size()) {
                    caja1.      add(cliente);
                } else {
                    caja2.add(cliente);
                }
                break;
            case PLATAFORMA:
                plataforma.add(cliente);
                break;
        }
    }

    @SuppressWarnings("t")
    public void atender() {
        while (!caja1.isEmpty() || !caja2.isEmpty() || !plataforma.isEmpty()) {
            if (!caja1.isEmpty()) {
                Cliente cliente = caja1.poll();
                System.out.println(cliente.getNombre() + " en atención caja1");
                try {
                    Thread.sleep(cliente.getTiempoEspera() * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!caja2.isEmpty()) {
                Cliente cliente = caja2.poll();
                System.out.println(cliente.getNombre() + " en atención caja2");
                try {
                    Thread.sleep(cliente.getTiempoEspera() * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!plataforma.isEmpty()) {
                Cliente cliente = plataforma.poll();
                System.out.println(cliente.getNombre() + " en atención plataforma");
                try {
                    Thread.sleep(cliente.getTiempoEspera() * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
