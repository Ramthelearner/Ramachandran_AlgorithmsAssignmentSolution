package com.greatlearning.stockers.service;

public class SortStockPrice {
	int i;
	public double array[], L[], R[];

	// Method gets unsorted array and returns sorted array
	public double[] implementationOfMergeSort(double array[]) {
		sortArray(array, 0, array.length - 1);
		return array;
	}

	// Main function which sorts the left, right array using merge sort
	private void sortArray(double[] array, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;
			// Call mergesort for the first half
			sortArray(array, l, m);
			// sort first and second halves
			sortArray(array, m + 1, r);
			// Merge the sorted halves
			conquerArray(array, l, m, r);
		}
	}

	private void conquerArray(double[] array, int l, int m, int r) {
		// Find the sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		// create temporary arrays
		double L[] = new double[n1];
		double R[] = new double[n2];
		// copy data to temporary arrays
		for (i = 0; i < n1; ++i) {
			L[i] = array[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = array[m + 1 + j];
		}
		// Merge the temp arrays
		// Initial indexes of first and second subarrays
		int i = 0, j = 0;
		// Initial index of merged subarray array
		int k = 1;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
}
