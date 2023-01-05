package test3;

import java.util.Scanner;

public class Main3_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 1;

    while(count < 10) {
      System.out.println(n + " * " + count + " = " + n * count);
      count++;
    }
  }
}