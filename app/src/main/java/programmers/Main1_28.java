package programmers;

import java.util.Scanner;

class Main1_28 {

  public static void main(String[] args) {}

  public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i = 1;
      String star = "*";

      while (i < n) {
        System.out.println(star);
      }

      System.out.println(n);
    }
  }
}