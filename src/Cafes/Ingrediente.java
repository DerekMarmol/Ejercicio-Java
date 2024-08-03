package Cafes;

public interface Ingrediente {
    String obtenerNombre();
    double obtenerCantidad();
    void usar(double cantidad);
}