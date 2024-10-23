
public class Ifelse {
  public static void main(String[] args) {
    int n1 = 20;
    int n2 = 40;
    if (n1 == n2) {
      System.out.println(n1 + "and" + n2 + "are equal");
    } else {
      if (n1 > n2) {
        System.out.println(n1 + "is greater than" + n2);
      } else {
        System.out.println(n1 + "is less than" + n2);
      }
    }
  }

}
