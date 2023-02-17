/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios34;

import java.util.Scanner;

/**
 *
 * @author Marc Gómez
 */
public class Ejercicios34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] tablero = new char[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tablero[x][y] = 'O';
            }
        }
        print_tablero(tablero);
        System.out.println("En que posición quiere colocar el alfil?");
        String pos=input.nextLine();
        char[] position=pos.toCharArray();
        Alfil piece=new Alfil(position);
        tablero=Alfil.tablero_movements(tablero,piece.position);
        print_tablero(tablero);
    }

    public static void print_tablero(char[][] tablero) {
        System.out.println("\ta\tb\tc\td\te\tf\tg\th");
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(8 - j + "\t");
            for (int h = 0; h < 8; h++) {
                System.out.print(tablero[j][h] + "\t");
            }
            System.out.println(8 - j);
            System.out.println();
        }
        System.out.println("\ta\tb\tc\td\te\tf\tg\th");
    }

}
