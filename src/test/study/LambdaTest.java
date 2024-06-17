package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LambdaTest {
    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = List.of(1, 2, 3, 4, 5, 6);
    }

    @Test
    @DisplayName("sumAll")
    void sumAll() {
        final int result = sumAll(numbers);
        Assertions.assertThat(result).isEqualTo(21);
    }

    @Test
    @DisplayName("sumAllEven")
    void sumAllEven() {
        final int result = sumAllEven(numbers);
        Assertions.assertThat(result).isEqualTo(12);
    }

//    private int sumAll(List<Integer> numbers) {
//        int total = 0;
//        for (int number : numbers) {
//            total += number;
//        }
//        return total;
//    }
//
//    private int sumAllEven(List<Integer> numbers) {
//        int total = 0;
//        for (int number : numbers) {
//            if(number % 2 == 0) {
//                total += number;
//            }
//        }
//        return total;
//    }

    private int sumAll(List<Integer> numbers) {
        return sumAll(numbers, number -> true);
    }

    private int sumAllEven(List<Integer> numbers) {
        return sumAll(numbers, number -> number % 2 == 0);
    }

//    private int sumAll(List<Integer> numbers, Conditional conditional) {
//        int total = 0;
//        for (int number : numbers) {
//            if(conditional.test(number)) {
//                total += number;
//            }
//        }
//        return total;
//    }

    private int sumAll(List<Integer> numbers, Predicate<Integer> conditional) {
        return numbers.stream()
                .filter(conditional)
                .reduce(0, Integer::sum);

//        int total = 0;
//        for (int number : numbers) {
//            if(conditional.test(number)) {
//                total += number;
//            }
//        }
//        return total;
    }

    @FunctionalInterface
    interface Conditional {
        boolean test(int number);
    }

}