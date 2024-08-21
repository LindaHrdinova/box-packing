package com.github.lindaHrdinova.box_packing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.lindaHrdinova.box_packing.BoxingSize.*;
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
		String oneBox = (scanner.nextLine());
		System.out.println(oneBox);


		String[] strArray = oneBox.split("\\s+");
		BoxingSize box1 = new BoxingSize();

		box1.setSideA(Double.parseDouble(strArray[0]));
		box1.setSideB(Double.parseDouble(strArray[1]));
		box1.setSideC(Double.parseDouble(strArray[2]));

		System.out.println("strana a: " + box1.getSideA());
		System.out.println("strana b: " + box1.getSideB());
		System.out.println("strana c: " + box1.getSideC());

		double sideAB = (double) (lcm((int) box1.getSideA()*100, (int) box1.getSideB()*100))/100;
		System.out.println("lcm of a and b is: " + sideAB);
		double sideABC = (double) (lcm((int) sideAB*100, (int) box1.getSideC()*100))/100;
		System.out.println("lcm of ab and c is: " + sideABC);
	}

}
