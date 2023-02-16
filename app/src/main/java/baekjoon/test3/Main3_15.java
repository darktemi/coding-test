package baekjoon.test3;

import java.util.Random;
import java.util.Scanner;

public class Main3_15 {
  public static void main(String[] args) {
    Random random = new Random();
    try (Scanner sc = new Scanner(System.in);) {

      int n = sc.nextInt();
      System.out.println(n);

      int[] ran = new int[n];

      for (int i = 0; i == ran.length -  1; i++) {
        ran[i] = random.nextInt(100);

      }

      System.out.println(random);

      while (ran.length == n) {

      }
    }

  }
}
