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
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Functions to calculate LCM using GCD
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Product size:");
        Scanner scanner = new Scanner(System.in);
        String allProducts = (scanner.nextLine());
        System.out.println(allProducts);

        double boxSize;

        // spliting input to array
        String[] allSidesStringArray = allProducts.split("\\s+");

        // three numbers were not entered for a product || no products have been entered
        if (allSidesStringArray.length % 3 != 0 || allSidesStringArray.length == 0) {
            System.err.println("Incorrect input.");
        } else {
            // String[] -> Double[] * 100 -> int[]
            long[] allSidesLongArray = Arrays.stream(allSidesStringArray)
                    .mapToDouble(Double::parseDouble)
                    .map(side -> side * 100)
                    .mapToLong(side -> (long) Math.round(side))
                    .toArray();

            System.out.println("Input: " + Arrays.toString(allSidesLongArray) + ", number of elements: " + allSidesLongArray.length);

            // LCM for all element array
            for (int i = 0; i < (allSidesLongArray.length - 1); i++) {
                System.out.println("lcm(" + allSidesLongArray[i] + ", " + allSidesLongArray[i+1] + ") = " + lcm(allSidesLongArray[i], allSidesLongArray[i + 1]));

                // Incorrect input range
                if( ((allSidesLongArray[0] > 1000000000.00 ) || (allSidesLongArray[i + 1]) > 1000000000.00) || ((allSidesLongArray[0]) < 1) || ((allSidesLongArray[i + 1]) < 1)) {
                    System.err.println("Incorrect input.");
                }

                boxSize = (double) lcm(allSidesLongArray[i], allSidesLongArray[i + 1]) / 100;
                allSidesLongArray[i+1] = lcm(allSidesLongArray[i], allSidesLongArray[i + 1]);


                // Box size
                if(boxSize > 10000000.00 || boxSize < 0.01) {
                    System.err.println("The box is too big.");
                    break;
                }
                else if (i == (allSidesLongArray.length - 2)) {
                    System.out.println("Box size: " + df.format(boxSize));
                }
            }
        }
    }
}
