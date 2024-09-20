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

            // Вызов всех функций из NumberOperations
            int max = NumberOperations.findMax(numbers);
            int min = NumberOperations.findMin(numbers);
            int sum = NumberOperations.calculateSum(numbers);
            double average = NumberOperations.calculateAverage(numbers);
            List<Integer> evenNumbers = NumberOperations.findEvenNumbers(numbers);

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
}
