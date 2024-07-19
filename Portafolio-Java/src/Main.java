import Calcular_IMC.IMC;
import Edad.EdadCalcular;
import Interfaz_grafica.Banner;
import maths.Mate;
import opcion.ListaOpciones;
import Grados.Grados_FC;
import Compras.ListaCompras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean progra = true;
        do {
            Banner.mensaje();
            ListaOpciones.carga();
            System.out.print("[?]: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            System.out.println("-----------------------------------------------");

            switch (opcion) {
                case 1:
                    // Llamar al método Calculadora de la clase Mate
                    Mate.Calculadora();
                    progra = false;
                    break; // Agrega este break para salir del switch después de cada caso

                case 2:
                    // Llamar al método programaIMC de la clase IMC
                    IMC.programaIMC();
                    progra = false;
                    break;

                case 3:
                    Grados_FC.gradosxd();
                    progra = false;
                    break;

                case 5:
                    // Llamar al método calcularEdad de la clase EdadCalcular
                    EdadCalcular.proceso();
                    progra = false;
                    break;

                case 6:
                    ListaCompras.Compra();
                    progra = false;
                    break;

                case 10:
                    progra = false;
                    break;
            }
        } while (progra);
    }
}
