package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число для проверки:");
		int num = in.nextInt();
		if (num > 67108864) {
			System.out.print("Число превышает максимальное.Введите другое число:");
			num = in.nextInt();
		}
		int two = 2;
		int twoPow = 1;
		for (int i = 0; i < 25; i++) {
			twoPow = (int) Math.pow(two, i);
			if (twoPow < num && num < twoPow * 2) {
				System.out.println("Данное число расположенно между два в степенни " + i + " и " + (i + 1));
			}
			if (num == twoPow) {
				System.out.println("Данное число расположенно между два в степенни " + (i - 1) + " и " + (i + 1));
			}
		}

	}

}
