package br.com.bmtptecnologia.algorithm.exericises;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise3 {
   // Reverse string

   public static String execute(String input) {
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

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      String firstInput = "Hello";

      String firstResult = execute(firstInput);

      System.out.println("Reversed string for " + firstInput + " is " + firstResult);

      String secondInput = "Reverse String in Java";

      String secondResult = execute(secondInput);

      System.out.println("Reversed string for " + firstInput + " is " + secondResult);
   }
}
