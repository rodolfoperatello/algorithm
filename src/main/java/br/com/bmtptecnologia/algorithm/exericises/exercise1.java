package br.com.bmtptecnologia.algorithm.exericises;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise1 {
   // Find factorial of a number

   public static int execute(int number) {
      if (number == 0) {
         return 0;
      }

      int result = 1;

      do {
         result = result * number;

         number--;

      } while (number != 1);

      return result;
   }

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(3);
      numbers.add(5);
      numbers.add(7);
      numbers.add(9);

      for (int number : numbers) {
         int result = execute(number);

         System.out.println("Factorial of " + number + " is " + result);
      }
   }

}

