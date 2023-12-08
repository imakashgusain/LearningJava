package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-1, 3, 5, 7, 9, 2, 4, 6, 8);
        List<String> names = Arrays.asList("Java", "PHP", "JavaScript", "Python");

        // MAP
        List<Integer> mappedList = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("mappedList: " + mappedList);

        // COLLECT
        List<Integer> squaredNumbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("squaredNumbers: " + squaredNumbers);

        // SORTED
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());

        List<String> sortedNamesDesc = names.stream().sorted((s1, s2) -> {
            System.out.printf("sort: %s; %s\n", s1, s2);
            return s2.compareTo(s1);
        }).collect(Collectors.toList());

        System.out.println("sortedNumbers: " + sortedNumbers);
        System.out.println("sortedNames: " + sortedNames);
        System.out.println("sortedNamesDesc: " + sortedNamesDesc);

        // FILTER
        List<Integer> evenNumbers = numbers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbers: " + evenNumbers);
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        System.out.println("filteredNames: " + filteredNames);

        Predicate<Integer> predicateToGetOddNumbers = integer -> integer % 2 != 0;
        List<Integer> oddNumbersUsingPredicate = numbers.stream().filter(predicateToGetOddNumbers).collect(Collectors.toList());
        System.out.println("oddNumbersUsingPredicate: " + oddNumbersUsingPredicate);

        // FOREACH
        numbers.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // REDUCE
        int sum = numbers.stream().reduce(0, Integer::sum);
        int max = numbers.stream().reduce(0, Integer::max);
        int min = numbers.stream().reduce(0, Integer::min);
        System.out.println("sum: "+sum);
        System.out.println("max: "+max);
        System.out.println("min: "+min);


    }
}
