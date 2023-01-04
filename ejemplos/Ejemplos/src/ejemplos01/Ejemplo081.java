/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        String mensajeSuma;
        String mensajeSumaDos;

        System.out.println("Si deseas obtener la tabla de suma ingresa 1, "
                + "si deseas obtener la tabla de multiplicacion ingresa 2");
        opcion = entrada.nextInt();

        if (opcion == 1 || opcion == 2) {
            if (opcion == 1) {
                mensajeSuma = obtenerTablaSumar(10, 9);
                System.out.printf("%s\n", mensajeSuma);
            } else {
                mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
                System.out.printf("%s\n", mensajeSumaDos);
            }
        } else {
            System.out.println("ERRORRR");
        }
// POR ALEX RAMIREZ
    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
