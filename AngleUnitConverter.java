import java.util.Scanner;

public class AngleUnitConverter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = Integer.parseInt(scn.nextLine());

        for (int i = 0; i < n ; i++) {
            String[] inputLine = scn.nextLine().split(" ");
            double number = Double.parseDouble(inputLine[0]);
            String measure = inputLine[1];
            if (measure.equals("deg")) {
                convertDegreesToRadians(number);
            } else if (measure.equals("rad")) {
                convertRadiansToDegrees(number);
            } else {
                System.out.println("Incorrect measure!");
            }

        }
    }
    private static void convertRadiansToDegrees(double number) {
        double numberInDegrees = Math.toDegrees(number);
        System.out.printf("%.6f deg", numberInDegrees);
        System.out.println();
    }

    private static void convertDegreesToRadians(double number) {
        double numberInRadians = Math.toRadians(number);
        System.out.printf("%.6f rad", numberInRadians);
        System.out.println();
    }
}
