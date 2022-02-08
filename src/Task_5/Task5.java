package Task_5;

import java.util.*;
import java.util.regex.Matcher;

public class Task5 {
    int V, val, size, n;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    public void setupCounter() {
        System.out.println("\tЕсть набор предметов, задаваемый заранее, предметы могут повторяться.");
        System.out.println("\tПредмет имеет 2 параметра: объем и ценность. Предметы неделимы. ");
        System.out.println("\tТакже задаётся сейф с обязательным параметром его объёма");
        System.out.println("\tНаписать программу, которая наполняет сейф набором предметов таким образом,");
        System.out.println("\t чтобы ценность этого набора была максимальной.");

        System.out.print("Объем сейфа: ");
        V = sc.nextInt();
        System.out.print("\nКоличество предметов: ");
        n = sc.nextInt();
        fillList(n);
    }

    public void fillList(int n) {
        this.n = n;
        System.out.println("Заполнение данных о предметах ");
        System.out.println("Вводите ценность и объем предметов: ");
        int weight[] = new int[n];
        int value[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ");
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
    }
}


