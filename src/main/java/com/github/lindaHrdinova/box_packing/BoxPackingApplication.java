package com.github.lindaHrdinova.box_packing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.lindaHrdinova.box_packing.BoxingSize.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class BoxPackingApplication {

    // Output to 2 decimal places
    private static final DecimalFormat df = new DecimalFormat("0.00");

    // Functions for calculating GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Functions to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Product size:");
        Scanner scanner = new Scanner(System.in);
        String allProducts = (scanner.nextLine());
        System.out.println(allProducts);

        double boxSize;

        // Spliting input to array
        String[] allSidesStringArray = allProducts.split("\\s+");

        // three numbers were not entered for a product || no products have been entered
        if (allSidesStringArray.length % 3 != 0 || allSidesStringArray.length == 0) {
            System.err.println("Incorrect input.");
        } else {
            // String[] -> Double[] * 100 -> int[]
            int[] allSidesIntArray = Arrays.stream(allSidesStringArray)
                    .mapToDouble(Double::parseDouble)
                    .map(side -> side * 100)
                    .mapToInt(side -> (int) Math.round(side))
                    .toArray();

            System.out.println("Input: " + Arrays.toString(allSidesIntArray) + ", number of elements: " + allSidesIntArray.length);

            // LCM for all element array
            for (int i = 0; i < (allSidesIntArray.length - 1); i++) {
                System.out.println("lcm(" + allSidesIntArray[i] + ", " + allSidesIntArray[i+1] + ") = " + lcm(allSidesIntArray[i], allSidesIntArray[i + 1]));
                boxSize = (double) lcm(allSidesIntArray[i], allSidesIntArray[i + 1]) / 100;
                allSidesIntArray[i+1] = lcm(allSidesIntArray[i], allSidesIntArray[i + 1]);

                if(boxSize >  10000000.00) {
                    System.err.println("The box is too big.");
                }
                else if (i == (allSidesIntArray.length - 2)) {
                    System.out.println("Box size: " + df.format(boxSize));
                }

            }
        }

    }

}
