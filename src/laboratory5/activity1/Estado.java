package laboratory5.activity1;

public enum Estado {
    EN_ESPERA("EN ESPERA"), EN_ATENCION("EN ATENCION"), ATENDIDO("ATENDIDO");

    private String estado;

    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public static Estado getEstado(String estado) {
        switch (estado) {
            case "EN ESPERA":
                return EN_ESPERA;
            case "EN ATENCION":
                return EN_ATENCION;
            case "ATENDIDO":
                return ATENDIDO;
            default:
                return null;
        }
    }
}
