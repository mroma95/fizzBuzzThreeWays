package versions;

import exceptions.BadWayOfNumbers;

import java.util.ArrayList;

public class SolutionThird implements FizzBuzz{
    @Override
    public void print(int from, int to) throws BadWayOfNumbers {
        checkRange(from, to);
        ArrayList<Integer> numbers= createArray(from,to);
        printFizzBuzzNumbers(numbers);
    }

    private void printFizzBuzzNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (number%3==0 && number%5==0){
                System.out.println(number+"-FizzBuzz");
            }else if (number%3==0){
                System.out.println(number+"-Fizz");
            }else if (number%5==0){
                System.out.println(number+"-Buzz");
            }
        }
    }

    private ArrayList<Integer> createArray(int from, int to) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = from; i <= to; i++) {
            arrayList.add(i);
        }

        return arrayList;
    }

    private void checkRange(int from, int to) throws BadWayOfNumbers {
        if (from>to){
            throw new BadWayOfNumbers("From can't be higher than to");
        }
    }
}
