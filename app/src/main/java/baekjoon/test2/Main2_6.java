package baekjoon.test2;

import java.util.Scanner;

public class Main2_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int h = a;
    int m = b + c;

    if(m < 60) {
      System.out.print(h);
      System.out.print(' ');
      System.out.print(m);
    } else if (m < 120) {
      if (h < 23) {
        System.out.print(h + 1);
        System.out.print(' ');
        System.out.print(m - 60);
      } else {
        System.out.print(h - 23);
        System.out.print(' ');
        System.out.print(m - 60);
      }
    } else if (m < 180) {
      if (h < 22) {
        System.out.print(h + 2);
        System.out.print(' ');
        System.out.print(m - 120);
      } else {
        System.out.print(h - 22);
        System.out.print(' ');
        System.out.print(m - 120);
      }
    } else if (m < 240) {
      if (h < 21) {
        System.out.print(h + 3);
        System.out.print(' ');
        System.out.print(m - 180);
      } else {
        System.out.print(h - 21);
        System.out.print(' ');
        System.out.print(m - 180);
      }
    } else if (m < 300) {
      if (h < 20) {
        System.out.print(h + 4);
        System.out.print(' ');
        System.out.print(m - 240);
      } else {
        System.out.print(h - 20);
        System.out.print(' ');
        System.out.print(m - 240);
      }
    } else if (m < 360) {
      if (h < 19) {
        System.out.print(h + 5);
        System.out.print(' ');
        System.out.print(m - 300);
      } else {
        System.out.print(h - 19);
        System.out.print(' ');
        System.out.print(m - 300);
      }
    } else if (m < 420) {
      if (h < 18) {
        System.out.print(h + 6);
        System.out.print(' ');
        System.out.print(m - 360);
      } else {
        System.out.print(h - 18);
        System.out.print(' ');
        System.out.print(m - 360);
      }
    } else if (m < 480) {
      if (h < 17) {
        System.out.print(h + 7);
        System.out.print(' ');
        System.out.print(m - 420);
      } else {
        System.out.print(h - 17);
        System.out.print(' ');
        System.out.print(m - 420);
      }
    } else if (m < 540) {
      if (h < 16) {
        System.out.print(h + 8);
        System.out.print(' ');
        System.out.print(m - 480);
      } else {
        System.out.print(h - 16);
        System.out.print(' ');
        System.out.print(m - 480);
      }
    } else if (m < 600) {
      if (h < 15) {
        System.out.print(h + 9);
        System.out.print(' ');
        System.out.print(m - 540);
      } else {
        System.out.print(h - 15);
        System.out.print(' ');
        System.out.print(m - 540);
      }
    } else if (m < 660) {
      if (h < 14) {
        System.out.print(h + 10);
        System.out.print(' ');
        System.out.print(m - 600);
      } else {
        System.out.print(h - 14);
        System.out.print(' ');
        System.out.print(m - 600);
      }
    } else if (m < 720) {
      if (h < 13) {
        System.out.print(h + 11);
        System.out.print(' ');
        System.out.print(m - 660);
      } else {
        System.out.print(h - 13);
        System.out.print(' ');
        System.out.print(m - 660);
      }
    } else if (m < 780) {
      if (h < 12) {
        System.out.print(h + 12);
        System.out.print(' ');
        System.out.print(m - 720);
      } else {
        System.out.print(h - 12);
        System.out.print(' ');
        System.out.print(m - 720);
      }
    } else if (m < 840) {
      if (h < 11) {
        System.out.print(h + 13);
        System.out.print(' ');
        System.out.print(m - 780);
      } else {
        System.out.print(h - 11);
        System.out.print(' ');
        System.out.print(m - 780);
      }
    } else if (m < 900) {
      if (h < 10) {
        System.out.print(h + 14);
        System.out.print(' ');
        System.out.print(m - 840);
      } else {
        System.out.print(h - 10);
        System.out.print(' ');
        System.out.print(m - 840);
      }
    } else if (m < 960) {
      if (h < 9) {
        System.out.print(h + 15);
        System.out.print(' ');
        System.out.print(m - 900);
      } else {
        System.out.print(h - 9);
        System.out.print(' ');
        System.out.print(m - 900);
      }
    } else if (m < 1020) {
      if (h < 8) {
        System.out.print(h + 16);
        System.out.print(' ');
        System.out.print(m - 960);
      } else {
        System.out.print(h - 8);
        System.out.print(' ');
        System.out.print(m - 960);
      }
    } else if (m < 1080) {
      if (h < 7) {
        System.out.print(h + 17);
        System.out.print(' ');
        System.out.print(m - 1020);
      } else {
        System.out.print(h - 7);
        System.out.print(' ');
        System.out.print(m - 1020);
      }
    }
  }
}