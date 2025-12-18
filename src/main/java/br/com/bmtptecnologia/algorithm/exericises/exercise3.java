package br.com.bmtptecnologia.algorithm.exericises;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise3 {
   // Reverse string

   public static String firstSolution(String input) {
      if (input.length() == 1) {
         return input;
      }

      char[] letters = input.toCharArray();

      StringBuilder stringBuilder = new StringBuilder();

      for (int i = letters.length - 1; i >= 0; i--) {
         stringBuilder.append(letters[i]);
      }

      return stringBuilder.toString();
   }

   public static String secondSolution(String input) {
      if (input.length() == 1) {
         return input;
      }

      StringBuilder stringBuilder = new StringBuilder();

      for (int i = input.length() - 1; i >= 0; i--) {
         stringBuilder.append(input.charAt(i));
      }

      return stringBuilder.toString();
   }

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      String firstInput = "Hello";

      String firstResult = firstSolution(firstInput);

      System.out.println("Reversed string for " + firstInput + " is " + firstResult);

      String secondInput = "Reverse String in Java";

      String secondResult = firstSolution(secondInput);

      System.out.println("Reversed string for " + firstInput + " is " + secondResult);

      String thirdInput = "Trying a new solution";

      String thirdResult = secondSolution(thirdInput);

      System.out.println("Reversed string for " + thirdInput + " in the second reverse method is " + thirdResult);
   }
}
