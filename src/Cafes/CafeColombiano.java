package Cafes;

public class CafeColombiano extends Cafe {
    private String tipoGrano;

    public CafeColombiano(String nombre, String tamaño, double precio, Granos granos, Agua agua, String tipoGrano) {
        super(nombre, tamaño, precio, granos, agua);
        this.tipoGrano = tipoGrano;
    }
    @Override
    public void preparar() {
        if (granos.obtenerCantidad() < 15 || agua.obtenerCantidad() < 200) {
            throw new IllegalStateException("No hay suficientes ingredientes para preparar el café colombiano.");
        }

        granos.usar(15);
        agua.usar(200);

        System.out.println("Moliendo " + granos.obtenerNombre() + " de tipo " + tipoGrano);
        System.out.println("Calentando " + agua.obtenerCantidad() + "ml de agua a 92°C");
        System.out.println("Extrayendo el café durante 25 segundos");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo café colombiano " + nombre + " en una taza de " + tamaño);
        System.out.println("Añadiendo una hoja de café como decoración");
    }
}