import java.util.Arrays;
import java.util.Scanner;

public class scale {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int scale = 8;
    String eight = sc.nextLine();
    eight = eight.replace(" ", "");
    String oneeight = "12345678";
    String eightone = "87654321";

    if(eight.equals(oneeight) == true){
      System.out.println("ascending");
    } else if(eight.equals(eightone) == true){
      System.out.println("descending");
    } else{
      System.out.println("mixed");
    }
  }
}
