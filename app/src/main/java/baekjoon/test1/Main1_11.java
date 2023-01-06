package baekjoon.test1;

import java.util.Scanner;

public class Main1_11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int A = scan.nextInt();
    int B = scan.nextInt();

    String BNum = Integer.toString(B);
    int[] arrB = new int[BNum.length()];
    for (int i = 0; i < BNum.length(); i++) {
      arrB[i] = BNum.charAt(i) - '0';
    }
    System.out.println(A * arrB[2]);
    System.out.println(A * arrB[1]);
    System.out.println(A * arrB[0]);
    System.out.println(A * B);
  }
}