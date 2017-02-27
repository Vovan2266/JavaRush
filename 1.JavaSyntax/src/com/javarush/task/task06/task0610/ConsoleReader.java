package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader readString = new BufferedReader(new InputStreamReader(System.in));
        String a = readString.readLine();
        return a;

    }

    public static int readInt() throws Exception {
        BufferedReader readInt = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(readInt.readLine());
        return b;

    }

    public static double readDouble() throws Exception {
        BufferedReader readDouble = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(readDouble.readLine());
        return c;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader readDouble = new BufferedReader(new InputStreamReader(System.in));
        boolean d = Boolean.parseBoolean(readDouble.readLine());
        return d;
    }

    public static void main(String[] args) {

    }
}
