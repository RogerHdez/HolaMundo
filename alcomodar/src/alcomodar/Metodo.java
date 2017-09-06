/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcomodar;

/**
 *
 * @author roger
 */
public class Metodo {

    public Metodo() {

    }

    public static int[] Alcomodar(int[] arreglo) {
//        int[] arreglo = array;
        int aux;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int x = i + 1; x < arreglo.length; x++) {
                if (arreglo[x] < arreglo[i]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[x];
                    arreglo[x] = aux;
                }
            }
        }

        return arreglo;
    }
}
