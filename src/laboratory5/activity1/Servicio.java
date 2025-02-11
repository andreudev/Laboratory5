package laboratory5.activity1;

public enum Servicio {
    CAJA, PLATAFORMA;

    public static Servicio getServicio(String servicio) {
        switch (servicio) {
            case "CAJA":
                return CAJA;
            case "PLATAFORMA":
                return PLATAFORMA;
            default:
                return null;
        }
    }
}
