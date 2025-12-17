package br.com.bmtptecnologia.algorithm.exericises;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise2 {
   // Compute the Sum of Array Elements.

   public static Integer execute(ArrayList<Integer> numbers) {
      if (numbers.isEmpty()) {
         return 0;
      }

      Integer sum = 0;

      for (int number : numbers) {
         sum += number;
      }

      return sum;
   }

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      ArrayList<Integer> firstList = new ArrayList<>();
      firstList.add(10);
      firstList.add(20);
      firstList.add(30);
      firstList.add(40);

      Integer firstResult = execute(firstList);

      System.out.println("Sum of numbers in array is " + firstResult);

      ArrayList<Integer> secondList = new ArrayList<>();
      secondList.add(17);
      secondList.add(23);
      secondList.add(30);
      secondList.add(70);

      Integer secondResult = execute(secondList);

      System.out.println("Sum of numbers in array is " + secondResult);
   }
}
