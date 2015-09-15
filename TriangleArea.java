import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Ax = scn.nextInt();
        int Ay = scn.nextInt();
        int Bx = scn.nextInt();
        int By = scn.nextInt();
        int Cx = scn.nextInt();
        int Cy = scn.nextInt();
        int area =  Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2);
        System.out.println(area);
    }
}
