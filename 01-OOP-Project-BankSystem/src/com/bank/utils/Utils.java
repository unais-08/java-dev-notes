package com.bank.utils;

import java.util.Scanner;

public class Utils {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}
