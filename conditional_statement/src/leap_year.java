import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int leap = sc.nextInt();

        if(((leap % 4 == 0) && (leap % 100 != 0)) || ((leap % 4 == 0) && (leap % 400 == 0))){
            System.out.println("1");
        } else{
            System.out.println("0");
        }
    }
}
