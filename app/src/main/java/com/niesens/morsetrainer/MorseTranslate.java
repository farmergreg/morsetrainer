package com.niesens.morsetrainer;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslate {
    private static final Map<Character, String> charToMorse = initCharToMorse();
    private static final Map<String, String> prosignToMorse = initProsignToMorse();

    private static Map<Character, String> initCharToMorse() {
        Map<Character, String> charToMorse = new HashMap<>();
        charToMorse.put('a', ".-");
        charToMorse.put('b', "-...");
        charToMorse.put('c', "-.-.");
        charToMorse.put('d', "-..");
        charToMorse.put('e', ".");
        charToMorse.put('f', "..-.");
        charToMorse.put('g', "--.");
        charToMorse.put('h', "....");
        charToMorse.put('i', "..");
        charToMorse.put('j', ".---");
        charToMorse.put('k', "-.-");
        charToMorse.put('l', ".-..");
        charToMorse.put('m', "--");
        charToMorse.put('n', "-.");
        charToMorse.put('o', "---");
        charToMorse.put('p', ".--.");
        charToMorse.put('q', "--.-");
        charToMorse.put('r', ".-.");
        charToMorse.put('s', "...");
        charToMorse.put('t', "-");
        charToMorse.put('u', "..-");
        charToMorse.put('v', "...-");
        charToMorse.put('w', ".--");
        charToMorse.put('x', "-..-");
        charToMorse.put('y', "-.--");
        charToMorse.put('z', "--..");
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");
        charToMorse.put('0', "-----");
        charToMorse.put('.', ".-.-.-");
        charToMorse.put(',', "--..--");
        charToMorse.put(':', "---...");
        charToMorse.put('?', "..--..");
        charToMorse.put('\\', ".----.");
        charToMorse.put('-', "-....-");
        charToMorse.put('/', "-..-.");
        charToMorse.put('(', "-.--.-");
        charToMorse.put(')', "-.--.-");
        charToMorse.put('"', ".-..-.");
        charToMorse.put('@', ".--.-.");
        charToMorse.put('=', "-...-");
        charToMorse.put(' ', "|");
        return charToMorse;
    }

    private static Map<String,String> initProsignToMorse() {
        Map<String, String> prosignToMorse = new HashMap<>();
        prosignToMorse.put("<AA>", ".-.-");
        prosignToMorse.put("<AR>", ".-.-.");
        prosignToMorse.put("<AS>", ".-...");
        prosignToMorse.put("<BK>", "-...-.-");
        prosignToMorse.put("<BT>", "-...-"); // also <TV>
        prosignToMorse.put("<CL>", "-.-..-..");
        prosignToMorse.put("<CT>", "-.-.-");
        prosignToMorse.put("<DO>", "-..---");
        prosignToMorse.put("<KN>", "-.--.");
        prosignToMorse.put("<SK>", "...-.-"); // also <VA>
        prosignToMorse.put("<VA>", "...-.-");
        prosignToMorse.put("<SN>", "...-."); // also <VE>
        prosignToMorse.put("<VE>", "...-.");
        prosignToMorse.put("<SOS>", "...---...");
        return prosignToMorse;
    }

    public static String textToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '<') {
                // ToDo prosign stuff
            } else {
                morseCode.append(charToMorse.get(Character.toLowerCase(text.charAt(i))));
                morseCode.append(" ");
            }
        }
        return morseCode.toString();
    }
}
