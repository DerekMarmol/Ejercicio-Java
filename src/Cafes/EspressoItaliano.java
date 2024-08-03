package Cafes;

public class EspressoItaliano extends Cafe {
    private int intensidad;

    public EspressoItaliano(String nombre, String tamaño, double precio, Granos granos, Agua agua, int intensidad) {
        super(nombre, tamaño, precio, granos, agua);
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        if (granos.obtenerCantidad() < 18 || agua.obtenerCantidad() < 30) {
            throw new IllegalStateException("No hay suficientes ingredientes para preparar el espresso italiano.");
        }

        granos.usar(18);
        agua.usar(30);

        System.out.println("Compactando " + granos.obtenerNombre() + " con una presión de " + (intensidad * 5) + " kg");
        System.out.println("Calentando la máquina de espresso a 93°C");
        System.out.println("Extrayendo el espresso con " + agua.obtenerCantidad() + "ml de agua durante 25-30 segundos");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo espresso italiano " + nombre + " con intensidad " + intensidad + " en una taza de " + tamaño);
        System.out.println("Verificando la presencia de una capa de crema dorada");
    }
}