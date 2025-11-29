package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };

		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));

		System.out.println("Sind die Arrays gleich?: " + compareArrays(a, b));
	}

	public static boolean compareArrays(int[] a, int[] b) {

		int i = 0;
		while (i < a.length && i < b.length && a[i] == b[i]) {
			i++;
		}

		return i == a.length && i == b.length;
	}
}
