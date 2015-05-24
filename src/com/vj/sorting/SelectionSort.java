package com.vj.sorting;

//https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html

public class SelectionSort {

	public static void main(String[] args) {

		int[] x = { 20, 15, 12, 30, -5, 72, 456 };
		SelectionSort.selectionSort(x);
	}

	public static void selectionSort(int[] ar){
		for (int i = 0;i<ar.length-1; i++)
		{
			int min = i;
			for (int j = i+1;j<ar.length; j++)
				if (ar[j]<ar[min]) min = j;
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		} 		
		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);

		}
	}
}
