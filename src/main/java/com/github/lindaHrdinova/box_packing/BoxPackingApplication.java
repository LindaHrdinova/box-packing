package com.github.lindaHrdinova.box_packing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.lindaHrdinova.box_packing.BoxingSize.*;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class BoxPackingApplication {

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
        String allBoxes = (scanner.nextLine());
        System.out.println(allBoxes);

        String[] allSidesStringArray = allBoxes.split("\\s+");
        if (allSidesStringArray.length % 3 != 0) {
            System.err.println("Incorrect input.");
        } else {
            // String[] -> Double[] * 100 -> int[]
            int[] allSidesIntArray = Arrays.stream(allSidesStringArray)
                    .mapToDouble(Double::parseDouble)
                    .map(side -> side * 100)
                    .mapToInt(side -> (int) Math.round(side))
                    .toArray();

            System.out.println("Input: " + Arrays.toString(allSidesIntArray) + ", number of elements: " + allSidesIntArray.length);
        }

        /*
		int sideAB = (lcm(box1.getSideA(), box1.getSideB()));
		double sideABC = ((double) (lcm(sideAB, box1.getSideC()))/100);
		System.out.println("Box size: " + sideABC);*/
    }

}
