package Task_1;
import java.util.Scanner;
import java.util.*;


public class Task1 {
    int count = 0;
    String str;
    Scanner sc = new Scanner(System.in);

    public int setupCounter() {
        System.out.println("Задание 1");
        System.out.println("1.	Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.\nЕсли цифр нет, то возвращаемая сумма должна быть равна 0");
        System.out.println("Введите строку:");
        str = sc.nextLine();
        System.out.println("Сумма цифр в строке:");
        return(Counter(str));
    }
    public int Counter(String stroke) {

        this.str = str;
        int sym;
        
        for(int i = 0; i < str.length(); i++) {
            sym = str.charAt(i)-'0';
            if(sym>=0 && sym<10) count += sym;
        }

        return count;
    }

}
