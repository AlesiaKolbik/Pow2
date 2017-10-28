package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число:");
		int Num = in.nextInt();
		if (Num < 0) {
			System.out.print(" Введите положительное число:");
			Num = in.nextInt();
		}
		if (Num > 67108864) {
			System.out.print(" Введите  число меньше 67 108 864:");
			Num = in.nextInt();
		}
		int two = 2;
		int twoPow = 0;
		int twoPowNext = 0;
		for (int i = 0; i < 26; i++) {
			twoPow = (int) Math.pow(two, i);
			twoPowNext = twoPow - twoPow;
			if (Num < twoPow && Num > twoPowNext) {
				System.out.println("Данное число расположенно между два в степенни " + (i - 1) + " и " + i);
				break;
			}

		}

	}

}