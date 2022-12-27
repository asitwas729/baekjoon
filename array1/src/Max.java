import java.util.Scanner;

public class Max {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = 9;
    int[] arr = new int[N];

    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    sc.close();

    int Max = arr[0];
    int Number = 0;
    for(int i = 1; i < arr.length; i++){
      if(Max < arr[i]){
        Max = arr[i];
        Number = i;
      }
    }
    System.out.println(Max);
    System.out.println(Number+1);
  }
}
