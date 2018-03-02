package edu.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static Boolean primeCheck(Integer number) {

        return !IntStream.range(2, (int) Math.sqrt(number)+1).anyMatch(num -> number % num == 0);

        //        if (number % 2 == 0)
//            return number == 2;
//        else {
//            for (int initial = 3; initial <= Math.sqrt(number); initial += 2) {
//                if (number % initial == 0)
//                    return false;
//            }
//        }
//        return true;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int number = 0; number < 100; number++) {
            Random random = new Random();
            integerList.add(random.nextInt(1000) + 2);
        }

        List<Integer> primeList = integerList.stream().filter(PrimeNumber::primeCheck).collect(Collectors.toList());
        System.out.println(primeList);
    }
}
