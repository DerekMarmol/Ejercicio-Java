package Cafes;

public class Granos implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Granos(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Granos de café " + tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }

    @Override
    public void usar(double cantidad) {
        if (this.cantidad < cantidad) {
            throw new IllegalStateException("No hay suficientes granos de café " + tipo);
        }
        this.cantidad -= cantidad;
    }
}