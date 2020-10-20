package versions;

import exceptions.BadWayOfNumbersException;

import java.util.stream.IntStream;

public class SolutionSecond implements FizzBuzz {
    @Override
    public void print(int from, int to) throws BadWayOfNumbersException {
        checkRange(from, to);
//        IntStream.rangeClosed(from, to)
//                .filter(i -> i % 3 == 0 || i % 5 == 0)
//                .mapToObj(i -> (i) + "-" + (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : ""))
//                .forEach(System.out::println);
        IntStream.rangeClosed(from, to)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .mapToObj(SolutionSecond::apply)
                .forEach(System.out::println);

    }

    private static String apply(int i) {
        String text = "";
        if (i % 3 == 0 && i % 5 == 0) {
            text = i + "-FizzBuzz";
        } else if (i % 3 == 0) {
            text = i + "-Fizz";
        } else if (i % 5 == 0) {
            text = i + "-Buzz";
        }
        return text;
    }

    private void checkRange(int from, int to) throws BadWayOfNumbersException {
        if (from > to) {
            throw new BadWayOfNumbersException("From can't be higher than to");
        }
    }

}
