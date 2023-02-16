package baekjoon.test3;

import java.util.Scanner;

public class Main3_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = "";
    int c = 1;
    int n = sc.nextInt(); // 10

    while(c <= n) {
      a += "*";
      c++;

      System.out.println(a);
    }
  }
}
