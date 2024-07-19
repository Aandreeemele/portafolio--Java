package Edad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EdadCalcular {

    // Proceso de peticion
    public static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        if ((fechaNacimiento != null) && (fechaActual != null)) {
            return Period.between(fechaNacimiento, fechaActual).getYears();
        } else {
            return 0;
        }
    }
    // Función para calcular los días y meses hasta el próximo cumpleaños
    public static Period tiempoHastaProximoCumple(LocalDate fechaNacimiento, LocalDate fechaActual) {
        LocalDate proximoCumple = fechaNacimiento.withYear(fechaActual.getYear());

        // Si el cumpleaños ya pasó este año, ajustar para el próximo año
        if (proximoCumple.isBefore(fechaActual) || proximoCumple.equals(fechaActual)) {
            proximoCumple = proximoCumple.plusYears(1);
        }
        return Period.between(fechaActual, proximoCumple);
    }
    public static LocalDate obtenerFecha(String tipoFecha) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el día de " + tipoFecha + ": ");
        int dia = scanner.nextInt();

        System.out.println("Introduce el mes de " + tipoFecha + ": ");
        int mes = scanner.nextInt();

        System.out.println("Introduce el año de " + tipoFecha + ": ");
        int año = scanner.nextInt();

        return LocalDate.of(año, mes, dia);
    }
    public static void imprimirEdad(int edad) {
        System.out.println("Tu edad es: " + edad + " años");
        System.out.println("-----------------------------------------------");
    }
    public static void imprimirTiempoHastaProximoCumple(Period tiempo) {
        System.out.println("Faltan " + tiempo.getMonths() + " meses y " + tiempo.getDays() + " días para tu próximo cumpleaños");
        System.out.println("-----------------------------------------------");
    }
    public static void proceso() {
        LocalDate fechaNacimiento = obtenerFecha("nacimiento");
        LocalDate fechaActual = obtenerFecha("la fecha actual");

        int edad = calcularEdad(fechaNacimiento, fechaActual);
        imprimirEdad(edad);

        Period tiempoHastaCumple = tiempoHastaProximoCumple(fechaNacimiento, fechaActual);
        imprimirTiempoHastaProximoCumple(tiempoHastaCumple);
    }}