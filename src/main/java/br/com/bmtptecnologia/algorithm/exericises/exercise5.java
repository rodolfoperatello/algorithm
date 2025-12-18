package br.com.bmtptecnologia.algorithm.exericises;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise5 {
   // Largest element in an array

   public static Integer execute(ArrayList<Integer> numbers) {
      if (numbers.size() == 1) {
         return numbers.getFirst();
      }

      Integer largest = numbers.getFirst();

      for (int number : numbers) {
         if (largest < number) {
            largest = number;
         }
      }

      return largest;
   }

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(7);
      numbers.add(3);
      numbers.add(6);
      numbers.add(9);

      Integer largest = execute(numbers);

      System.out.println("Largerst number in array " + numbers + " is " + largest);

      ArrayList<Integer> secondNumbers = new ArrayList<>();
      secondNumbers.add(35);
      secondNumbers.add(30);
      secondNumbers.add(42);
      secondNumbers.add(9);

      Integer largestInSecondList = execute(secondNumbers);

      System.out.println("Largerst number in array " + secondNumbers + " is " + largestInSecondList);
   }
}
