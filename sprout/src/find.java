import java.util.Scanner;

public class find {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int StudentCount = 30;
    int[] Student = new int[StudentCount];

    for(int i = 1; i <= StudentCount; i++){
      Student[i] = sc.nextInt();
    }
  }
}
