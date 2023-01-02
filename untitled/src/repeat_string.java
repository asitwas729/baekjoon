import java.util.Scanner;

public class repeat_string {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    char[] line;

    for(int i = 0; i < T; i++){
      int R = sc.nextInt();
      line = sc.next().toCharArray();

      for(int k = 0; k < line.length; k++){
        for(int j = 0; j < R; j++){
          System.out.print(line[k]);
        }
      }
      System.out.println();
    }
  }
}
