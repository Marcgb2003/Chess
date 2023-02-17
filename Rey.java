/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios34;

/**
 *
 * @author Marc Gómez
 */
public class Rey {
     public static char[] position;
    public static char Symbol = 'A';

    public Rey(char[] position) {
        this.position = position;

    }

    public static char[][] tablero_movements(char[][] tablero, char[] position) {
        int[] position_get = get_position(position);
        int[] movement_1 = get_position(position);
        int[] movement_2 = get_position(position);
        int[] movement_3 = get_position(position);
        int[] movement_8 = get_position(position);
        int[] movement_4= get_position(position);
        int[] movement_5 = get_position(position);
        int[] movement_6 = get_position(position);
        int[] movement_7 = get_position(position);
        tablero[position_get[0]][position_get[1]] = Symbol;
        System.out.println("Se puede mover a ");
            if (movement_1[0] - 1 >=0){
                movement_1[0]--;
                tablero[movement_1[0]][movement_1[1]] = 'X';
                show_position(movement_1);
            } 
            if (movement_2[0] - 1 >= 0 && movement_2[1] - 1 >= 0) {
                movement_2[0]--;
                movement_2[1]--;
                tablero[movement_2[0]][movement_2[1]] = 'X';
                show_position(movement_2);
            } 
            if (movement_3[0] + 1 <= 7 && movement_3[1] + 1 <= 7) {
                movement_3[0]++;
                movement_3[1]++;
                tablero[movement_3[0]][movement_3[1]] = 'X';
                show_position(movement_3);
            } 
            if (movement_4[0] + 1 <= 7 && movement_4[1] - 1 >= 0) {
                movement_4[0]++;
                movement_4[1]--;
                tablero[movement_4[0]][movement_4[1]] = 'X';
                show_position(movement_4);
            } 
            if (movement_5[1] - 1 >= 0) {
                movement_5[1]--;
                tablero[movement_5[0]][movement_5[1]] = 'X';
                show_position(movement_5);
            } 
            if (movement_6[0] - 1 >= 0 && movement_6[1]+1<=7) {
                movement_6[0]--;
                movement_6[1]++;
                tablero[movement_6[0]][movement_6[1]] = 'X';
                show_position(movement_6);
            }
            if (movement_7[0] + 1 <= 7) {
                movement_7[0]++;
                tablero[movement_7[0]][movement_7[1]] = 'X';
                show_position(movement_7);
            } 
            if (movement_8[1] +1 <= 7) {
                movement_8[1]++;
                tablero[movement_8[0]][movement_8[1]] = 'X';
                show_position(movement_8);
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
