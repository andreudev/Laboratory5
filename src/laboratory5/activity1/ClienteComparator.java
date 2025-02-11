package laboratory5.activity1;

import java.util.Comparator;

public class ClienteComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        if (o1.getPrioridadValue() == o2.getPrioridadValue()) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
        return o2.getPrioridadValue() - o1.getPrioridadValue();
    }
}
