package baekjoon.test1;

import java.util.Scanner;

public class Main1_9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] chess = new int[6];
    int[] check = {1, 1, 2, 2, 2, 8};

    int k = scan.nextInt();
    int q = scan.nextInt();
    int l = scan.nextInt();
    int b = scan.nextInt();
    int n = scan.nextInt();
    int p = scan.nextInt();

    System.out.println(1 - k);
    System.out.println(1 - q);
    System.out.println(2 - l);
    System.out.println(2 -b);
    System.out.println(2 -n);
    System.out.println(8 -p);
  }
}