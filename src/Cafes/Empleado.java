package Cafes;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private List<Orden> ordenesPendientes;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.ordenesPendientes = new ArrayList<>();
    }

    public void trabajar() {
        if (!ordenesPendientes.isEmpty()) {
            Orden orden = ordenesPendientes.remove(0);
            System.out.println(nombre + " está preparando: " + orden.getDescripcion());
            orden.getCafe().preparar();
            orden.getCafe().servir();
            System.out.println(nombre + " ha completado la orden de " + orden.getDescripcion());
        } else {
            System.out.println(nombre + " está limpiando el área de trabajo y verificando el inventario.");
        }
    }

    public void tomarOrden() {
        Random rand = new Random();
        String[] tiposCafe = {"Colombiano", "Espresso Italiano"};
        String[] tamaños = {"pequeño", "mediano", "grande"};

        String tipoCafe = tiposCafe[rand.nextInt(tiposCafe.length)];
        String tamaño = tamaños[rand.nextInt(tamaños.length)];

        Cafe cafeOrdenado;
        if (tipoCafe.equals("Colombiano")) {
            cafeOrdenado = new CafeColombiano(tipoCafe, tamaño, 3.5, new Granos("Colombiano", 1000), new Agua(5000), "Supremo");
        } else {
            cafeOrdenado = new EspressoItaliano(tipoCafe, tamaño, 2.5, new Granos("Italiano", 1000), new Agua(5000), 8);
        }

        Orden nuevaOrden = new Orden(cafeOrdenado);
        ordenesPendientes.add(nuevaOrden);

        System.out.println(nombre + " ha tomado una orden de " + nuevaOrden.getDescripcion());
    }
}