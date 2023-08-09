package morseCodeTranslator;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class MorseCode {

    private HashMap<String, String> codes;

    public MorseCode() {

        codes = new HashMap<>();
        String[] morseCode = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--",
                "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----",
                "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**"};

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
                "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};

        for (int i = 0; i < morseCode.length; i++) {
            codes.put(morseCode[i], letters[i]);
            codes.put(letters[i], morseCode[i]);
        }
    }

    public String getCode(String text) {
        String finalText = "";  //the translated text or error message
        String textUp = text.toUpperCase();

        if (text.length() > 1 && !text.contains(" ")) {  //to check if the text is separated with space
            if (codes.get(text) != null) {   //to check if the input has corresponding code, if yes, it is a single code,
                finalText = codes.get(text); //otherwise it misses space
            } else {
                String[] stringArray1 = textUp.split("");
                for (int i = 0; i < stringArray1.length; i++) {

                    if (codes.get(stringArray1[i]) != null) {
                        finalText = "Please separate with space.";
                    } else {//to check if every character is legal     //else if (codes.get(stringArray1[i]) == null)

                        String illegal = "";
                        for (int j = 0; j < stringArray1.length; j++) {
                            if (codes.get(stringArray1[j]) == null) {
                                illegal += stringArray1[j];
                            }
                        }
                        finalText = "It contains illegal character: " + illegal; //to pick out illegal character
                        break;
                    }
                }
            }

        } else {
            String value = ""; //corresponding single code or error message
            String output = "";
            String[] stringArray = textUp.split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    if (codes.get(stringArray[i]) != null) {
                        value = codes.get(stringArray[i]);
                    } else {
                        value = "#"; //to replace invalid code with #
                    }
                    output += value + " ";
                    StringBuffer sb = new StringBuffer(output);  //to delete the last " "
                    sb.deleteCharAt(sb.length() - 1);
                    finalText = sb.toString();

                } catch (IllegalArgumentException e) {
                }
            }
        }

        return finalText;
    }

}