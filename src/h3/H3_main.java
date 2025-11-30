package h3;

import java.util.Arrays;

public class H3_main {

	public static void main(String[] args) {

		int[] a = { 5, 8, 3 };
		int[] b = { 1, 3, 5 };

		System.out.println("Array 1: " + Arrays.toString(a));
		System.out.println("Array 2: " + Arrays.toString(b));

		System.out.println("Haben sie genau die gleichen Werte?: " + compareArraysVal(a, b));
	}

	public static boolean compareArraysVal(int[] a, int[] b) {

		int i = 0;

		while (i < a.length) {

			int wert = a[i];

			int countA = 0;
			int countB = 0;

			int j = 0;
			while (j < a.length) {
				if (a[j] == wert) {
					countA++;
				}
				j++;
			}

			j = 0;
			while (j < b.length) {
				if (b[j] == wert) {
					countB++;
				}
				j++;
			}

			if (countA != countB) {
				return false;
			}

			i++;
		}

		return true;
	}
}