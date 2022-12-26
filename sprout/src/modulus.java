import java.util.Scanner;

public class modulus {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long sum = Math.abs(N - M);
    System.out.println(sum);
  }
}
