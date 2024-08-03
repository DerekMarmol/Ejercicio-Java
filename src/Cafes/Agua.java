package Cafes;

public class Agua implements Ingrediente {
    private double cantidad;

    public Agua(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Agua";
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }

    @Override
    public void usar(double cantidad) {
        if (this.cantidad < cantidad) {
            throw new IllegalStateException("No hay suficiente agua");
        }
        this.cantidad -= cantidad;
    }
}