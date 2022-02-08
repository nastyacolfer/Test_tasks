package Task_3;

import java.util.*;
import java.util.regex.*;

public class Task3 {
    Scanner sc = new Scanner(System.in);
    String str;
    Pattern pattern=Pattern.compile("а|и|е|у|э|о|а|ы|я|ю");
    int count;

    public void setupCounter() {
        System.out.println("Задание 3");
        System.out.println("\tСоздайте программу, которая будет подсчитывать количество гласных в словах,");
        System.out.println("\tвыводить слова отсортированным списком по количеству гласных, делать первую");
        System.out.println("\tгласную букву в слове заглавной\n");
        System.out.println("Введите строку, слова разделены пробелом:");
        str = sc.nextLine();
        split(str);
    }
    public void split(String s) {
        ArrayList<String> list = new ArrayList<String>();
        String[] words = s.split(" ");
        System.out.println("Количество гласных:");
        numOfVowels(words);
        System.out.println("Отсортированнный список: ");
        sortedArray(words);
        System.out.println("Первая гласная - заглавная: ");
        bigSym(words);
    }
    public void numOfVowels(String[] words) {
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            count = 0;
            Matcher matcher= pattern.matcher(words[i]);
            while(matcher.find())  count++;
            list1.add(words[i]+" - "+count+" гласных букв");
        }
        System.out.println(list1);
    }

    public void sortedArray(String[] words) {
        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            count = 0;
            Matcher matcher= pattern.matcher(words[i]);
            while(matcher.find())  count++;
            list2.add(count+" "+words[i]);
        }
        Collections.sort(list2);
        Collections.reverse(list2);

        String buf; String[] buffer;
        for(int i = 0; i<list2.size(); i++) {
            buf = list2.get(i);
            list2.remove(i);
            buffer = buf.split(" ");
            list2.add(i, buffer[1]);
        }
        System.out.println(list2);
    }
    public void bigSym(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("(а|и|е|у|э|о|а|ы|я|ю)(.*)")) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
