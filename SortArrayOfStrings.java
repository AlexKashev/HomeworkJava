import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[a];
        for (int i = 0; i < a; i++){
            str[i] = scanner.nextLine();
        }

        Arrays.sort(str);
        for(int i =0; i<a;i++){
            System.out.println(str[i]);
        }

    }
}
