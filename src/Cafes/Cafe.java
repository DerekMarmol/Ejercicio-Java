package Cafes;

public abstract class Cafe {
    protected String nombre;
    protected String tamaño;
    protected double precio;
    protected Granos granos;
    protected Agua agua;
    protected Leche leche;

    public Cafe(String nombre, String tamaño, double precio, Granos granos, Agua agua) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.granos = granos;
        this.agua = agua;
    }

    public abstract void preparar();
    public abstract void servir();
}