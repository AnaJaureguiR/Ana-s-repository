/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3Ej2;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Tema3Ej2 {

    public static void main(String[] args) {

        char pais, hortaliza = 0;
        int toneladas = 0;
        Scanner datos = new Scanner(System.in);

        int total_e = 0, total_f = 0, total_a = 0;

        System.out.println("Escribe el pais (E, F, A), tipo de hortaliza (T, P, E) y cantidad de toneladas");

        do {
            pais = datos.next().charAt(0);

            if (pais != '@') {
                hortaliza = datos.next().charAt(0);
                toneladas = datos.nextInt();
            }

            switch (pais) {
                case 'E':
                    if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E') {
                        total_e += toneladas;
                    }
                    break;
                case 'F':
                    if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E') {
                        total_f += toneladas;
                    }
                    break;
                case 'A':
                    if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E') {
                        total_a += toneladas;
                    }
                    break;
                default:
                    break;
            }
        } while (pais != '@');

        if (total_e > total_f && total_e > total_a) {
            System.out.println("El pais con más toneladas es España con " + total_e + " toneladas");
        } else if (total_f > total_e && total_f > total_a) {
            System.out.println("El pais con más toneladas es Francia con " + total_f + " toneladas");
        } else {
            System.out.println("El pais con más toneladas es Alemania con " + total_a + " toneladas");
        }
    }
}
