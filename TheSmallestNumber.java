import java.util.Scanner;

public class TheSmallestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        if(a<b && b<c){
            System.out.println(a);
        }if(b<c && c<a){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
