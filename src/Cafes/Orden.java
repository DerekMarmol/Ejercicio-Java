package Cafes;

public class Orden {
    private Cafe cafe;
    private String descripcion;

    public Orden(Cafe cafe) {
        this.cafe = cafe;
        this.descripcion = cafe.nombre + " " + cafe.tamaño;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public String getDescripcion() {
        return descripcion;
    }
}