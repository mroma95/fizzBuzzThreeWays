package versions;

import exceptions.BadWayOfNumbersException;

public class SolutionFirst implements FizzBuzz {
    @Override
    public void print(int from, int to) throws BadWayOfNumbersException {
        checkRange(from, to);
        for (int i = from; i <= to; i++) {
            printFizzBuzz(i);
        }
    }
    private void printFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i+"-FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println(i+"-Fizz");
        } else if (i % 5 == 0) {
            System.out.println(i+"-Buzz");
        } else {
            System.out.println(i);
        }
    }

    private void checkRange(int from, int to) throws BadWayOfNumbersException {
        if (from > to) {
            throw new BadWayOfNumbersException("From can't be higher than to");
        }
    }
}

