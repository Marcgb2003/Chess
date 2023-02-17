/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios34;

/**
 *
 * @author Marc Gómez
 */
public class Torre {

    public static char[] position;
    public static char Symbol = 'T';

    public Torre(char[] position) {
        this.position = position;

    }

    public static char[][] tablero_movements(char[][] tablero, char[] position) {
        int[] position_get = get_position(position);
        int[] movement_l = get_position(position);
        int[] movement_r = get_position(position);
        int[] movement_d = get_position(position);
        int[] movement_u = get_position(position);
        tablero[position_get[0]][position_get[1]] = Symbol;
        int conta = 0;
        int contb = 0;
        int contc = 0;
        int contd = 0;
        boolean alldone = false;
        System.out.println("Se puede mover a ");
        while (!alldone) {
            if (movement_l[1] - 1 >= 0) {
                movement_l[1]--;
                tablero[movement_l[0]][movement_l[1]] = 'X';
                show_position(movement_l);
            } else {
                conta++;
            }
            if (movement_u[0] - 1 >= 0) {
                movement_u[0]--;
                tablero[movement_u[0]][movement_u[1]] = 'X';
                show_position(movement_u);
            } else {
                contb++;
            }
            if (movement_d[0] + 1 <= 7) {
                movement_d[0]++;
                tablero[movement_d[0]][movement_d[1]] = 'X';
                show_position(movement_d);
            } else {
                contc++;
            }
            if (movement_r[1] +1 <= 7) {
                movement_r[1]++;
                tablero[movement_r[0]][movement_r[1]] = 'X';
                show_position(movement_r);
            } else {
                contd++;
            }
            if (conta > 0 && contb > 0 && contc > 0 && contd > 0) {
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
        System.out.println("Error, lo que no has puuesto se va fuera de límites");
        System.exit(0);
    }
}


