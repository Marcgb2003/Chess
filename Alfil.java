/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios34;

/**
 *
 * @author Marc Gómez
 */
public class Alfil {

    public static char[] position;
    public static char Symbol = 'A';

    public Alfil(char[] position) {
        this.position = position;

    }

    public static char[][] tablero_movements(char[][] tablero, char[] position) {
        int[] position_get = get_position(position);
        int[] movement_ld = get_position(position);
        int[] movement_lu = get_position(position);
        int[] movement_rd = get_position(position);
        int[] movement_ru = get_position(position);
        tablero[position_get[0]][position_get[1]] = Symbol;
       boolean donea= false;
       boolean doneb=false;
       boolean donec=false;
        boolean doned=false;
        boolean alldone = false;
        System.out.println("Se puede mover a ");
        while (!alldone) {
            if (movement_ld[0] - 1 >= 0 && movement_ld[1] + 1 <= 7) {
                movement_ld[0]--;
                movement_ld[1]++;
                tablero[movement_ld[0]][movement_ld[1]] = 'X';
                show_position(movement_ld);
            } else {
                donea=true;
            }
            if (movement_lu[0] - 1 >= 0 && movement_lu[1] - 1 >= 0) {
                movement_lu[0]--;
                movement_lu[1]--;
                tablero[movement_lu[0]][movement_lu[1]] = 'X';
                show_position(movement_lu);
            } else {
                doneb=true;
            }
            if (movement_rd[0] + 1 <= 7 && movement_rd[1] + 1 <= 7) {
                movement_rd[0]++;
                movement_rd[1]++;
                tablero[movement_rd[0]][movement_rd[1]] = 'X';
                show_position(movement_rd);
            } else {
                donec=true;
            }
            if (movement_ru[0] + 1 <= 7 && movement_ru[1] - 1 >= 0) {
                movement_ru[0]++;
                movement_ru[1]--;
                tablero[movement_ru[0]][movement_ru[1]] = 'X';
                show_position(movement_ru);
            } else {
                doned=true;
            }
            if (donea && doneb && donec && doned) {
                alldone = true;
            }
        }
        return tablero;
    }

    public static void show_position(int[] movement) {
        char[] movement_coded = new char[2];
        switch (movement[1]) {
            case 0 ->
                movement_coded[0] = 'a';
            case 1 ->
                movement_coded[0] = 'b';
            case 2 ->
                movement_coded[0] = 'c';
            case 3 ->
                movement_coded[0] = 'd';
            case 4 ->
                movement_coded[0] = 'e';
            case 5 ->
                movement_coded[0] = 'f';
            case 6 ->
                movement_coded[0] = 'g';
            case 7 ->
                movement_coded[0] = 'h';
        }
        int moved_num = 8 - movement[0];
        movement_coded[1] = Character.forDigit(moved_num, 10);
        System.out.println("\t " + movement_coded[0] + movement_coded[1]);
    }

    public static int[] get_position(char[] position) {
        int[] position_gotten = new int[2];
        if (position[0] >= 'a' && position[0] <= 'z') {
            switch (position[0]) {
                case 'a' ->
                    position_gotten[1] = 0;
                case 'b' ->
                    position_gotten[1] = 1;
                case 'c' ->
                    position_gotten[1] = 2;
                case 'd' ->
                    position_gotten[1] = 3;
                case 'e' ->
                    position_gotten[1] = 4;
                case 'f' ->
                    position_gotten[1] = 5;
                case 'g' ->
                    position_gotten[1] = 6;
                case 'h' ->
                    position_gotten[1] = 7;
                default ->
                    error();
            }
            position_gotten[0] = 8 - Character.getNumericValue(position[1]);
        } else {
            switch (position[1]) {
                case 'a' ->
                    position_gotten[1] = 0;
                case 'b' ->
                    position_gotten[1] = 1;
                case 'c' ->
                    position_gotten[1] = 2;
                case 'd' ->
                    position_gotten[1] = 3;
                case 'e' ->
                    position_gotten[1] = 4;
                case 'f' ->
                    position_gotten[1] = 5;
                case 'g' ->
                    position_gotten[1] = 6;
                case 'h' ->
                    position_gotten[1] = 7;
                default ->
                    error();
            }
            position_gotten[0] = Character.getNumericValue(position[0]) - 1;
        }
        return position_gotten;
    }

    public static void error() {
        System.out.println("Error, lo que has puuesto se va fuera de límites");
        System.exit(0);
    }
}
