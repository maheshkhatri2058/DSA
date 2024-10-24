package PrimeNumber;

import java.util.Scanner;

class Primebtn {
  public static void main(String[] args) {
    System.out.println("hello");
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();
    for (int n = low; n <= high; n++) {
      int count = 0;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        System.out.println(n);
      }
    }
  }
}