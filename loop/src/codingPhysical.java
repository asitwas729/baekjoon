import java.util.Scanner;

public class codingPhysical {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int result = input / 4;
    String realResult = "";

    for(int i = 0; i<result; i++){
      realResult += "long ";
    }
    realResult += "int";
    System.out.println(realResult);
  }

}
