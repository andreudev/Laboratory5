package laboratory5.activity3;

public enum Servicio {
    PIZZA, CAFES, HELADO;

    public static Servicio getServicio(String servicio) {
        switch (servicio) {
            case "PIZZA":
                return PIZZA;
            case "CAFES":
                return CAFES;
            case "HELADO":
                return HELADO;
            default:
                return null;
        }
    }
}
