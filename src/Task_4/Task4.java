package Task_4;

import java.util.Scanner;

public class Task4 {
    char sym = '*';

    char[][] n1 = {{' ', ' ', sym, ' ', ' '}, {' ', sym, sym, ' ', ' '}, {sym, ' ', sym, ' ', ' '}, {' ', ' ', sym, ' ', ' '}, {' ', ' ', sym, ' ', ' '}, {' ', ' ', sym, ' ', ' '}};
    char[][] n2 = {{' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {' ', ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', ' ', ' '}, {sym, sym, sym, sym, ' '}};
    char[][] n3 = {{' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {' ', ' ', sym, ' ', ' '}, {' ', ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}};
    char[][] n4 = {{sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {sym, sym, sym, sym, ' '}, {' ', ' ', ' ', sym, ' '},{' ', ' ', ' ', sym, ' '}};
    char[][] n5 = {{sym, sym, sym, sym, ' '}, {sym, ' ', ' ', ' ', ' '}, {sym, sym, sym, ' ', ' '}, {' ', ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}};
    char[][] n6 = {{' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', ' ', ' '}, {sym, sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}};
    char[][] n7 = {{sym, sym, sym, sym, ' '}, {' ', ' ', ' ', sym, ' '}, {' ', ' ', ' ', sym, ' '}, {' ', ' ', sym, sym, ' '}, {' ', ' ', sym, ' ', ' '}, {' ', ' ', sym, ' ', ' '}};
    char[][] n8 = {{' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}};
    char[][] n9 = {{' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, sym, ' '}, {' ', ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}};
    char[][] n0 = {{' ', sym, sym, ' ', ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {sym, ' ', ' ', sym, ' '}, {' ', sym, sym, ' ', ' '}};

    public void fill() {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        char[][] num = new char[6][number.length()*5];
        for (int z = 0; z < number.length(); z++) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 5; j++) {
                    switch (number.charAt(z)) {
                        case '0' -> num[i][j + 5 * z] = n0[i][j];
                        case '1' -> num[i][j + 5 * z] = n1[i][j];
                        case '2' -> num[i][j + 5 * z] = n2[i][j];
                        case '3' -> num[i][j + 5 * z] = n3[i][j];
                        case '4' -> num[i][j + 5 * z] = n4[i][j];
                        case '5' -> num[i][j + 5 * z] = n5[i][j];
                        case '6' -> num[i][j + 5 * z] = n6[i][j];
                        case '7' -> num[i][j + 5 * z] = n7[i][j];
                        case '8' -> num[i][j + 5 * z] = n8[i][j];
                        case '9' -> num[i][j + 5 * z] = n9[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < number.length() * 5; j++) System.out.print(num[i][j]);
            System.out.println();
        }
    }
}
