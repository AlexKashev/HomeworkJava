import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        String convertNumber = Integer.toHexString(a);

        System.out.printf("The hexa of %d is %s", a,convertNumber.toUpperCase());
    }
}
