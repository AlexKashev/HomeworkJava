import java.util.Scanner;

public class CountOfBitOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        String binaryString = Integer.toBinaryString(inputNumber);
        int counterPresenceOfOne = 0;

        for(int i = 0; i < binaryString.length(); i++){
            if (binaryString.charAt(i) == '1') {
                counterPresenceOfOne++;
            }
        }

        System.out.printf("The presence of bit 1 in number %d is %d.", inputNumber, counterPresenceOfOne);
    }
}
