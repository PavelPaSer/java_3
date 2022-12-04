//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        Random numbers = new Random();
        ArrayList<Integer> array_num = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array_num.add(numbers.nextInt(100));
        }
        System.out.println(array_num);
        System.out.printf("Максимальный элемент списка = %s\n", Collections.max(array_num));
        System.out.printf("Минимальный элемент списка = %s\n", Collections.min(array_num));
        System.out.printf("Среднее арифметическое списка = %s\n", getAverage(array_num) );
    }

    private static Object getAverage(ArrayList<Integer> array_num) {
        return array_num.stream().mapToInt(a -> a).average().orElse(0);
    }
}