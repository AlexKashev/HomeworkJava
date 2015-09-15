import java.util.Scanner;

public class SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = Integer.parseInt(scn.nextLine());
        int b = Integer.parseInt(scn.nextLine());

        for (int i = a; i <= b; i++) {
            if (Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString())) {
                System.out.println(i);
            }

        }
    }
}