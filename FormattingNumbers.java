import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        String aToHex = Integer.toHexString(a).toUpperCase();
        int aToBinary = Integer.parseInt(Integer.toBinaryString(a));

        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|", aToHex, aToBinary, b, c);
    }
}
