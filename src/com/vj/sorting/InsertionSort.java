package com.vj.sorting;

//https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html

public class InsertionSort {

	public static void main(String[] args) {

		int[] x = { 20, 15, 12, 30, -5, 72, 456 };
		InsertionSort.insertionSort(x);
	}

	public static void insertionSort(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int index = ar[i];
			int j = i;
			while (j > 0 && ar[j - 1] > index) {
				ar[j] = ar[j - 1];
				j--;
			}
			ar[j] = index;
		}

		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);

		}
	}
}
