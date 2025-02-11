package laboratory5.activity1;

public class Cliente {
    private String nombre;
    private Servicio servicio;
    private Prioridad prioridad;
    private  Estado estado;
    private int tiempoEspera;

    public Cliente(String nombre, String servicio, String prioridad, int tiempoEspera) {
        this.nombre = nombre;
        this.servicio = Servicio.getServicio(servicio);
        this.prioridad = Prioridad.getPrioridad(prioridad);
        this.tiempoEspera = tiempoEspera;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public String getNombre() {
        return nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public int getPrioridadValue() {
        return prioridad.getPrioridad();
    }

    public String getServicioValue() {
        return servicio.toString();
    }

}
