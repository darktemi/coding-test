package test3;

import java.util.Scanner;

public class Main3_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = "";
    int c = 1;
    int t = sc.nextInt();

    while(c <= t) {
      a += "*";
      c++;

      System.out.println(a);
    }
  }
}