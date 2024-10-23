import java.util.Scanner;

public class Studentmarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    if (marks > 90) {
      System.out.println("Excllent");
    } else if (marks >= 80 & marks < 90) {
      System.out.println("Verry Good");
    } else if (marks > 70 & marks < 80) {
      System.out.println("Good");
    } else if (marks < 70 & marks > 60) {
      System.out.println("Average");
    } else {
      System.out.println("Failed");
    }
  }
}
