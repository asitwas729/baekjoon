import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class already_exist {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("joonas", "baekjoon"));
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String duplication = "??!";
        System.out.println(id + duplication);

    }
}
