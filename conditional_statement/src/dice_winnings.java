import java.util.Scanner;

public class dice_winnings {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int reward;

    if((A == B)){
      if(B == C){
        reward = 10000 + A * 1000;
      }else{
        reward = 1000 + A * 100;
      }
    } else if((A == C)){
        reward = 1000 + A * 100;
    } else if((B == C)){
        reward = 1000 + B * 100;
    } else{
        int max;
        if((A >= B) && (A >= C)) {
          max = A;
        } else if ((B >= A) && (B >= C)){
          max = B;
        } else{
          max = C;
        }
        reward = max * 100;
    }
    System.out.println(reward);
  }
}
