package laboratory5.activity3;

public class Cliente {
    private String nombre;
    private String pedido;
    private Estado estado;
    private Servicio servicio;

    public Cliente(String nombre, String servicio) {
        this.nombre = nombre;
        this.servicio = Servicio.getServicio(servicio);
        this.estado = Estado.EN_PREPARACION;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
}
