package br.com.bmtptecnologia.algorithm.exericises;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;

import br.com.bmtptecnologia.algorithm.AlgorithmApplication;

public class exercise6 {
   // Find the transpose of Matrix
   /*
      Input:         Output
     [ 1, 2, 3 ]   [ 1, 4, 7 ]

     [ 4, 5, 6 ]   [ 2, 5, 8 ]

     [ 7, 8, 9 ]   [ 3, 6, 9 ]

    */

   public static int[][] execute(int[][] matrix) {
      int lines = matrix.length;
      int columns = matrix[0].length;

      int[][] transposedMatrix = new int[lines][columns];

      for (int i = 0; i < lines; i++) {
         for (int j = 0; j < columns; j++) {
            transposedMatrix[i][j] = matrix[j][i];
         }
      }

      return transposedMatrix;
   }

   public static void main(String[] args) {
      SpringApplication.run(AlgorithmApplication.class, args);

      int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

      int[][] result = execute(matrix);

      System.out.println("Transpose of " + Arrays.deepToString(matrix) + " is " + Arrays.deepToString(result));
   }
}
