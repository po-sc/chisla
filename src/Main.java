import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Чтение данных из файла number.txt
        try {
            File file = new File("/Users/po_scripty/Documents/JAVAPROG/huetenschslami/huetenschslami/src/numbers.txt");
            Scanner fileScanner = new Scanner(file);

            // Чтение чисел из файла
            while (fileScanner.hasNextInt()) {
                numbers.add(fileScanner.nextInt());
            }
            fileScanner.close();

            // Если файл пустой, сообщаем пользователю
            if (numbers.isEmpty()) {
                System.out.println("Файл пуст или не содержит чисел.");
                return;
            }

            // Вызов всех функций
            int max = findMax(numbers);
            int min = findMin(numbers);
            int sum = calculateSum(numbers);
            double average = calculateAverage(numbers);
            List<Integer> evenNumbers = findEvenNumbers(numbers);

            // Вывод результатов
            System.out.println("Максимальное число: " + max);
            System.out.println("Минимальное число: " + min);
            System.out.println("Сумма всех чисел: " + sum);
            System.out.println("Среднее арифметическое: " + average);
            System.out.println("Четные числа: " + evenNumbers);

        } catch (FileNotFoundException e) {
            System.out.println("Файл number.txt не найден.");
        }
    }

    // Найти максимальное число в списке
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Найти минимальное число в списке
    public static int findMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Посчитать сумму всех чисел в списке
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Посчитать "среднее арифметическое" (с ошибкой)
    public static double calculateAverage(List<Integer> numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return (double) product / numbers.size();
    }


//    public static double calculateAverage(List<Integer> numbers) {
//        int sum = calculateSum(numbers);
//        return (double) sum / numbers.size();
//    }

    // Найти все четные числа в списке
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
}
