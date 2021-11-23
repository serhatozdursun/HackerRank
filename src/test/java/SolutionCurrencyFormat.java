import java.text.NumberFormat;

import java.util.Locale;

import java.util.Scanner;

import static java.util.Locale.*;

public class SolutionCurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        var us = NumberFormat.getCurrencyInstance(US).format(payment);
        var india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment).replaceAll("U+20B9","Rs.");
        var china = NumberFormat.getCurrencyInstance(CHINA).format(payment);
        var france = NumberFormat.getCurrencyInstance(FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}