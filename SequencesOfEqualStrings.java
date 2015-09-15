import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] words = scn.nextLine().split(" ");

        for (int i = 0; i < words.length -1 ; i++) {
            System.out.print(words[i] + " ");
            if(!words[i].equals(words[i+1])){
                System.out.println();
            }
        }
        System.out.println(words[words.length-1]);

    }
}
