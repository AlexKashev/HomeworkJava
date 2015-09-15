import java.util.Scanner;

public class PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        String in = "Inside";
        String out = "Outside";


        boolean insideFirstFigure = (a>=12.5 && a<=22.5 && b>=6 && b<=13.5);
        boolean insideSecondFigure = (a>=12.5 && a<=17.5 && b>=6 && b<=13.5);
        boolean insideThirdFigure =  (a>=20 && a<=22.5 && b>=6 && b<=13.5);

        if(insideFirstFigure || insideSecondFigure || insideThirdFigure){
            System.out.println(in);
        }else{
            System.out.println(out);
        }

    }
}
