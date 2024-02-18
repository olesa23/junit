package by.academy.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Long> numbers = random.longs(100, 0, 101)
                .map(num -> (long) ((num * Math.PI) - 20))
                .mapToObj(Long::valueOf)
                .filter(num -> num < 100)
                .sorted()
                .skip(3)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);


        Map<Long, String> resultMap = numbers.stream()
                .collect(Collectors.toMap(num -> num, num1 -> ("Number: " + num1)));

        resultMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
