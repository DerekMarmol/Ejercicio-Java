package Cafes;

public class OtrosIngredientes implements Ingrediente {
    private String nombre;
    private double cantidad;

    public OtrosIngredientes(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }

    @Override
    public void usar(double cantidad) {
        if (this.cantidad < cantidad) {
            throw new IllegalStateException("No hay suficiente " + nombre);
        }
        this.cantidad -= cantidad;
        System.out.println("Usando " + cantidad + " de " + nombre);
    }
}