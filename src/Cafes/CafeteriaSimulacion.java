package Cafes;

public class CafeteriaSimulacion {
    public static void main(String[] args) {
        Sucursal sucursal = new Sucursal("Café Central", "Calle Principal 123");

        Empleado barista1 = new Empleado("Ana", "Barista", 2000);
        Empleado barista2 = new Empleado("Carlos", "Barista", 2000);
        sucursal.agregarEmpleado(barista1);
        sucursal.agregarEmpleado(barista2);

        Granos granosColombiano = new Granos("Colombiano", 5000);
        Granos granosItaliano = new Granos("Italiano", 5000);
        Agua agua = new Agua(10000);
        Leche lecheEntera = new Leche("Entera", 5000);
        OtrosIngredientes azucar = new OtrosIngredientes("Azúcar", 2000);

        sucursal.agregarIngrediente(granosColombiano);
        sucursal.agregarIngrediente(granosItaliano);
        sucursal.agregarIngrediente(agua);
        sucursal.agregarIngrediente(lecheEntera);
        sucursal.agregarIngrediente(azucar);

        Equipo maquinaEspresso = new Equipo("Máquina de Espresso");
        Equipo molinillo = new Equipo("Molinillo de Café");
        sucursal.agregarEquipo(maquinaEspresso);
        sucursal.agregarEquipo(molinillo);

        System.out.println("Iniciando un día de trabajo en " + sucursal.getNombre());

        for (int i = 0; i < 5; i++) {
            barista1.tomarOrden();
            barista2.tomarOrden();
        }

        for (int i = 0; i < 10; i++) {
            barista1.trabajar();
            barista2.trabajar();
            maquinaEspresso.usar();
            molinillo.usar();
        }

        System.out.println("Fin del día de trabajo en " + sucursal.getNombre());
    }
}
