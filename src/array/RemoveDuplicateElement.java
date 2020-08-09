package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int[] array = new int[] {4, 3, 2, 4, 9, 2};
		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (array[i] == array[j]) {
					array[j] = array[size - 1];					
					size--;					
					j--;					
				}
			}
			for (int arr : array) {
				System.out.print(arr + " ");
			}
			System.out.println(" ");
		}
		int[] arrayWithoutDuplicates = Arrays.copyOf(array, size);
		for (int i : arrayWithoutDuplicates) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		int[] removeDuplicateInAnArray = removeDuplicateInAnArrayUsingSorting(array);
		for (int i : removeDuplicateInAnArray) { 
			System.out.print(i + " "); 
		}		 
		removeDuplicateInAnArrayUsingSet(array);
	}
	
	public static int[] removeDuplicateInAnArrayUsingSorting(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		int j = 0;
		for (int i = 0; i < len - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len - 1];
		int[] arrayWithoutDuplicates = Arrays.copyOf(arr, j);
		return arrayWithoutDuplicates;
	}
	
	public static void removeDuplicateInAnArrayUsingSet(int[] arr) {
		Set<Integer> arrayWithoutDuplicates = new LinkedHashSet<Integer>();
		for (Integer integer : arr) {
			arrayWithoutDuplicates.add(integer);
		}
		Integer[] array = arrayWithoutDuplicates.toArray(new Integer[arrayWithoutDuplicates.size()]);
		System.out.println(" ");
		for (Integer integer : array) {
			System.out.print(integer+" ");
		}
	}

}