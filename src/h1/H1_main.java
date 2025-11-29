package h1;

import java.util.Arrays;

public class H1_main {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 3, 2, 1 };

		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));

		System.out.println("Sie sind Spiegelbilder: " + isMirrorArray(a, b));

	}

	public static boolean isMirrorArray(int[] a, int[] b) {

		int i = 0;
		int j = b.length - 1;

		while (i < a.length && j>= 0) {

			if (a[i] != b[j]) {
				return false;
			}

			i++;
			j--;
		}

		return a.length == b.length;
	}

}
