package org.capgemini.daimler;

public class Arrdes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 46,39,92,34,12,72,93};
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("array sorted in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
