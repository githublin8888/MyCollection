package printText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TextCounting {

    private int row;
    private int length;
    private int countWord;
    private String longestWord;
    private String text1;

    public TextCounting() {
        row = 0;
        length = 0;
        countWord = 0;
        longestWord = "";
        text1 = "";

    }

    public int getNbrOfRows() {
        return row;
    }

    public int getNbrOfcharacters() {
        return length;
    }

    public int getNbrOfWords() {
        return countWord;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void calculateNr(String text) {

        if ("stop".equals(text)) {
        } else {
            //calculate row
            row++;

            //calculate character number
            length = length + text.replace(" ", "").length();

            //calculate word number
            String[] wordArray = text.split("\\s");
            int length2;
            if (!text.equals("")) {
                length2 = wordArray.length;

            } else length2 = 0;

            countWord = countWord + length2;

            //search the longest words
            text1 = text1 + " " + text;
            ;

            String[] longArray = text1.split("\\s");

            for (int i = 0; i < longArray.length - 1; i++) {
                if (longArray[i].length() > longArray[i + 1].length()) {
                    String temp = longArray[i];
                    longArray[i] = longArray[i + 1];
                    longArray[i + 1] = temp;
                }
                longestWord = longArray[longArray.length - 1];

                int characterNr = longestWord.length();

                for (int j = 0; j < longArray.length - 1; j++) {
                    if (longArray[j].length() == characterNr) {
                        longestWord = longestWord + ", " + longArray[j];
                    }
                }
            }

        }
    }
}




















