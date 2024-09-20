import java.util.ArrayList;
import java.util.List;

public class NumberOperations {

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
