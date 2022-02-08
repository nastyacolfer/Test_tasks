package Task_5;

import java.util.*;
import java.util.regex.Matcher;

public class Task5 {
    int V, val, size, n;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    public void setupCounter() {
        System.out.println("\tЕсть набор предметов, задаваемый заранее, предметы могут повторяться.\n");
        System.out.println("\tПредмет имеет 2 параметра: объем и ценность. Предметы неделимы. \n");
        System.out.println("\tТакже задаётся сейф с обязательным параметром его объёма\n");
        System.out.println("\tНаписать программу, которая наполняет сейф набором предметов таким образом,\n");
        System.out.println("\t чтобы ценность этого набора была максимальной.");

        System.out.print("Объем сейфа: "); V = sc.nextInt();
        System.out.print("\nКоличество предметов: "); n = sc.nextInt();
        fillList(n);

    }
    public void fillList(int n) {
        this.n = n;
        System.out.println("Заполнение данных о предметах ");
        System.out.println("Вводите ценность и объем предметов: ");
        int p[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ");
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
        }

    }

    }


