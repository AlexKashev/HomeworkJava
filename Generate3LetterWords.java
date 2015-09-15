import java.util.Scanner;

public class Generate3LetterWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String letter = scn.nextLine();
        String word = "";

        for (int i = 0; i < letter.length(); i++) {
                    for (int j = 0; j < letter.length(); j++) {
                        for (int k = 0; k < letter.length(); k++) {
                            word = "" + letter.charAt(i) + letter.charAt(j) + letter.charAt(k);
                            System.out.println(word);
                        }
            }
        }
    }
}
