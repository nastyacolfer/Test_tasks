package Task_2;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Task2 {
    Scanner sc = new Scanner(System.in);
    int num;
    ArrayList<Integer> list = new ArrayList<>();

    public void setupCounter() {
        System.out.println("Задание 2");
        System.out.println("\tСоздайте программу, которая будет вычислять и выводить на экран простые множители,");
        System.out.println("\tиз которых состоит целое число, введенное пользователем.\n");
        System.out.println("Введите целое число:");

        try {
            num = sc.nextInt();
            System.out.println("Множители:");
            System.out.println(Counter(num, 2));
        } catch (InputMismatchException e) {
            System.out.println("Целое число!");
            sc.next();
        }


    }
    public ArrayList<Integer> Counter(int n, int d) {
        if (n == 1) return(list);
        if (n%d == 0) {
            list.add(d);
            n = n/d;
            return Counter(n, 2);
        } else return Counter(n, d+1);
    }

}
