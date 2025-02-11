package laboratory5.activity1;

public enum Prioridad {
    NORMAL(1), GESTANTE(2), DISCAPACITADO(2), ADULTOMAYOR(2);

    private int prioridad;

    Prioridad(int i) {
        this.prioridad = i;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public static Prioridad getPrioridad(String prioridad) {
        switch (prioridad) {
            case "NORMAL":
                return NORMAL;
            case "GESTANTE":
                return GESTANTE;
            case "DISCAPACITADO":
                return DISCAPACITADO;
            case "ADULTOMAYOR":
                return ADULTOMAYOR;
            default:
                return null;
        }
    }
}
