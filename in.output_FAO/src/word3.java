import java.util.Scanner;

public class word3 {
    public static void main(String[] args){
        int sum = 0;
        int[] word = new int[4];

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = 1; B > 0; i++){
            word[i] = (B % 10);
            B /= 10;
            if(i == 1){
                sum = sum + word[i] * A;
            } else if(i == 2){
                sum = sum + word[i] * A * 10;
            } else if(i == 3){
                sum = sum + word[i] * A * 100;
            }
            System.out.println(word[i] * A);
        }
        System.out.println(sum);

        sc.close();
    }
}
