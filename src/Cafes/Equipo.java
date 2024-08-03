package Cafes;

import java.util.Random;

public class Equipo {
    private String tipo;
    private String estado;
    private int usosDesdeMantenimineto;

    public Equipo(String tipo) {
        this.tipo = tipo;
        this.estado = "operativo";
        this.usosDesdeMantenimineto = 0;
    }

    public void usar() {
        if (estado.equals("averiado")) {
            throw new IllegalStateException("El equipo está averiado y no puede ser usado.");
        }
        usosDesdeMantenimineto++;
        if (usosDesdeMantenimineto > 100) {
            estado = "necesita mantenimiento";
        }
        System.out.println("Usando " + tipo + ". Usos desde último mantenimiento: " + usosDesdeMantenimineto);
    }

    public void reparar() {
        if (estado.equals("operativo")) {
            System.out.println("El " + tipo + " no necesita reparación.");
            return;
        }

        Random rand = new Random();
        int tiempoReparacion = rand.nextInt(120) + 30; // Entre 30 y 150 minutos

        System.out.println("Iniciando reparación del " + tipo);
        System.out.println("Diagnóstico del problema...");
        System.out.println("Reemplazando piezas defectuosas...");
        System.out.println("Probando funcionamiento...");

        try {
            Thread.sleep(tiempoReparacion * 10); // Simulamos el tiempo de reparación
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estado = "operativo";
        usosDesdeMantenimineto = 0;
        System.out.println("El " + tipo + " ha sido reparado después de " + tiempoReparacion + " minutos y está listo para usar.");
    }
}