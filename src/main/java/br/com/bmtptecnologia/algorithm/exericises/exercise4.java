package br.com.bmtptecnologia.algorithm.exericises;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise4 {
   // Check if a string is a palindrome

   public static boolean execute(String input) {
      if (input.length() == 1) {
         return true;
      }

      StringBuilder stringBuilder = new StringBuilder();

      for (int i = input.length() - 1; i >= 0; i--) {
         stringBuilder.append(input.charAt(i));
      }

      return stringBuilder.toString().equals(input);
   }

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      String firstInput = "car";

      boolean firstResult = execute(firstInput);

      System.out.println("Does the word " + firstInput + " a palindrome? " + firstResult);

      String secondInput = "racecar";

      boolean secondResult = execute(secondInput);

      System.out.println("Does the word " + secondInput + " a palindrome? " + secondResult);

      String thirdInput = "level";

      boolean thirdResult = execute(thirdInput);

      System.out.println("Does the word " + thirdInput + " a palindrome? " + thirdResult);
   }
}
