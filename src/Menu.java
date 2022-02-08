import Task_1.Task1;
import Task_2.Task2;
import Task_3.Task3;
import Task_4.Task4;
import Task_5.Task5;
import java.util.Scanner;
import java.lang.*;

public class Menu {
    int menu = -1;
    Scanner sc = new Scanner(System.in);

    void starter() {

        System.out.println("\t\t\tМеню");

        while (menu != 0) {
            System.out.println("\t\tВыберите номер задания:");
            menu = sc.nextInt();

            switch (menu) {
                case (1):
                    Task1 t1 = new Task1();
                    System.out.println(t1.setupCounter());
                    break;
                case (2):
                    Task2 t2 = new Task2();
                    t2.setupCounter();
                    break;
                case (3):
                    Task3 t3 = new Task3();
                    t3.setupCounter();
                    break;
                case (4):
                    Task4 t4 = new Task4();
                    t4.fill();
                    break;
                case (5):
                    Task5 t5 = new Task5();
                    t5.setupCounter();
                    break;
            }
        }
    }
}
