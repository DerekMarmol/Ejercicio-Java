package Cafes;

public class Leche implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Leche(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Leche " + tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }

    @Override
    public void usar(double cantidad) {
        if (this.cantidad < cantidad) {
            throw new IllegalStateException("No hay suficiente leche " + tipo);
        }
        this.cantidad -= cantidad;
        System.out.println("Usando " + cantidad + "ml de leche " + tipo);
    }
}