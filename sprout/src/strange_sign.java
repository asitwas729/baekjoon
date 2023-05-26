import java.util.Scanner;

public class strange_sign {
  public static long addNum(long a, long b){
    long result = (a + b) * (a - b);
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long result = addNum(a, b);
    System.out.println(result);

  }
}
