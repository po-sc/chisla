import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findMax() {
        List<Integer> numbers1 = Arrays.asList(1, 5, 3, 9, 2);
        assertEquals(9, Main.findMax(numbers1), "Максимальное число должно быть 9");

        List<Integer> numbers2 = Arrays.asList(-5, -3, -9, -1, -2);
        assertEquals(-1, Main.findMax(numbers2), "Максимальное число должно быть -1");

        List<Integer> numbers3 = Arrays.asList(7);
        assertEquals(7, Main.findMax(numbers3), "Максимальное число должно быть 7");
    }

    @Test
    void findMin() {
        List<Integer> numbers1 = Arrays.asList(1, 5, 3, 9, 2);
        assertEquals(1, Main.findMin(numbers1), "Минимальное число должно быть 1");

        List<Integer> numbers2 = Arrays.asList(-5, -3, -9, -1, -2);
        assertEquals(-9, Main.findMin(numbers2), "Минимальное число должно быть -9");

        List<Integer> numbers3 = Arrays.asList(7);
        assertEquals(7, Main.findMin(numbers3), "Минимальное число должно быть 7");
    }

    @Test
    void calculateSum() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, Main.calculateSum(numbers1), "Сумма чисел должна быть 15");

        List<Integer> numbers2 = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-15, Main.calculateSum(numbers2), "Сумма чисел должна быть -15");

        List<Integer> numbers3 = Arrays.asList(10);
        assertEquals(10, Main.calculateSum(numbers3), "Сумма чисел должна быть 10");
    }

    @Test
    void calculateAverage() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, Main.calculateAverage(numbers1), 0.001, "Среднее арифметическое должно быть 3.0");

        List<Integer> numbers2 = Arrays.asList(10);
        assertEquals(10.0, Main.calculateAverage(numbers2), 0.001, "Среднее арифметическое должно быть 10.0");

        List<Integer> numbers3 = Arrays.asList(5, 15);
        assertEquals(10.0, Main.calculateAverage(numbers3), 0.001, "Среднее арифметическое должно быть 10.0");
    }

    @Test
    void findEvenNumbers() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectedEvenNumbers1 = Arrays.asList(2, 4, 6);
        assertEquals(expectedEvenNumbers1, Main.findEvenNumbers(numbers1), "Список четных чисел должен быть [2, 4, 6]");

        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7);
        List<Integer> expectedEvenNumbers2 = Arrays.asList();
        assertEquals(expectedEvenNumbers2, Main.findEvenNumbers(numbers2), "Список четных чисел должен быть пуст");

        List<Integer> numbers3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> expectedEvenNumbers3 = Arrays.asList(2, 4, 6, 8);
        assertEquals(expectedEvenNumbers3, Main.findEvenNumbers(numbers3), "Список четных чисел должен быть [2, 4, 6, 8]");
    }
}
