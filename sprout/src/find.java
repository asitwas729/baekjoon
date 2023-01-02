import java.util.Scanner;

public class find {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int StudentCount = 30;
    int[] Student = new int[StudentCount];

    for(int i = 1; i <= StudentCount; i++){
      Student[i] = sc.nextInt();
    }
    for(int i = 0; i < StudentCount; i++){
      for(int j = 0; j < StudentCount; j++){
        if(i == Student[i]){
          break;
        }
        if(j == StudentCount){
          System.out.println(j);
        }
      }
    }
  }
}
