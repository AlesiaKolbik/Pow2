package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число степени двойки:");
		int Num = in.nextInt();
		if (Num%2!=0)
			System.out.println("Число не является сетепью двойки");
			Num = in.nextInt();
		}
		int Two = 2;
		int TwoPow = 0;
		for (double i = 0; i < 26; i++) {
			TwoPow += (int) Math.pow(Two, i);
			if (Num == TwoPow) {
				System.out.println("Данное число расположенно между два в степенни " + i + " и " + (i + 2));
			}
			else (Num%2!=0)
					System.out.println("Число не является сетепью двойки");
		}

	}
}
