package mastermind_v2.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            write(title);
            try {
                input = bufferedReader.readLine();
                ok = true;
            } catch (Exception ex) {
                writeError("characte string");
            }
        } while (!ok);
        return input;
    }

    public static String readString() {
        return readString("");
    }

    public static int readInt(String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(readString(title));
                ok = true;
            } catch (Exception ex) {
                writeError("integer");
            }
        } while (!ok);
        return input;
    }

    public static char readChar(String title) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = readString(title);
            if (input.length() != 1) {
                writeError("character");
            } else {
                charValue = input.charAt(0);
                ok = true;
            }
        } while (!ok);
        return charValue;
    }

    public static void writeln() {
        System.out.println();
    }

    public static void write(String string) {
        System.out.print(string);
    }

    public static void writeln(String string) {
        System.out.println(string);
    }

    public static void write(char character) {
        System.out.print(character);
    }

    private static void writeError(String format) {
        System.out.println("FORMAT ERROR! " + "Enter a " + format + " formatted value.");
    }
}
