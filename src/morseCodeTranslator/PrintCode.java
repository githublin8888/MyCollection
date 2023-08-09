package morseCodeTranslator;

import morseCodeTranslator.MorseCode;

import java.util.Scanner;


public class PrintCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseCode code = new MorseCode();

        System.out.println("Enter your message with letters, '*', '-', number 0-9 or '.', ',', '?', separating by space: ");
        String text =scan.nextLine();
        System.out.print(code.getCode(text));

    }
}