import java.util.Scanner;

public class Max_Min {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int Max = arr[0];
    int Min = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(Max < arr[i]){
        Max = arr[i];
      } else if(Min > arr[i]){
        Min = arr[i];
      }
    }
    System.out.println(Min + " " + Max);
  }
}
