package printText;

import java.util.Scanner;
public class Printer {
    public static void main(String[] args) {

        TextCounting myText = new TextCounting();
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        while (!"stop".equals(text)) {
            myText.calculateNr(text);
            text = scan.nextLine();
        }


        System.out.println(myText.getNbrOfRows() + " row(s)");
        System.out.println(myText.getNbrOfcharacters() + " character(s)");
        System.out.println(myText.getNbrOfWords() + " word(s)");
        System.out.println("Longest word: " + myText.getLongestWord());
    }


}
