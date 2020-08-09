package sort;

/**
 * How to implement a merge sort in Java?
 * 
 * First we need to know the concept of merge sort
 * 
 * A merge sort is a type of a divide and conquer algorithm used to sort a given array; this means that the array is divided into halves 
 * and then further sub-divided till division can no longer take place.
 * 
 * This happens when you reach a single element array as that has no middle to further divide the array on. Each divided sub-array is then sorted 
 * and subsequently merged with other sub-divisions. The sorted merge continues till all divisions of the array have been merged, 
 * giving us a sorted array.
 * 
 * The selection sort and insertion sort, have worst-case running times of Θ(n2). When the size of the input array is large, 
 * these algorithms can take a long time to run. In order to solve the time complexity we can use merge sort and quick sort,
 * whose running times are better. In particular, merge sort runs in Θ(nlogn) time in all cases, and 
 * quick sort runs in Θ(nlogn) time in the best case and on average, though its worst-case running time is Θ(n2) 
 * 
 * Divide-and-conquer:
 * 
 * Both merge sort and quicksort employ a common algorithmic paradigm based on recursion. This paradigm, divide-and-conquer, 
 * breaks a problem into subproblems that are similar to the original problem, recursively solves the subproblems, and 
 * finally combines the solutions to the subproblems to solve the original problem.
 * 
 * Because divide-and-conquer solves subproblems recursively, each subproblem must be smaller than the original problem, 
 * and there must be a base case for subproblems. 
 * 
 * You should think of a divide-and-conquer algorithm as having three parts:
 * 
 * 1. Divide - the problem into a number of subproblems that are smaller instances of the same problem.
 * 2. Conquer - the subproblems by solving them recursively. If they are small enough, solve the subproblems as base cases.
 * 3. Combine - the solutions to the subproblems into the solution for the original problem.
 * 
 * You can easily remember the steps of a divide-and-conquer algorithm as divide, conquer, combine. Here's how to view one step, 
 * assuming that each divide step creates two subproblems (though some divide-and-conquer algorithms create more than two):
 *
 */
public class MergeSort {
	/**
	 * merge method which compares and sorts the left and right arrays.
	 * The function takes in many parameters; the left array, the right array, the actual array, the sizes of the left and right array.
	 * @param left_arr
	 * @param right_arr
	 * @param arr - The array to be sorted
	 * @param left_size
	 * @param right_size
	 */
	public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size) {		
		int i = 0,l = 0,r = 0;
		//The while loops check the conditions for merging
		/*
		 * The first while loop from lines 11 to 18 checks if the value of both the iterators is less than the respective array size,
		 * then it compares which of the element in right_arr or left_arr is smaller than the other and chooses that one to place in arr. 
		 */
		while (l < left_size && r < right_size) {			
			if(left_arr[l]<right_arr[r]){
				arr[i++] = left_arr[l++];
			}
			else{
				arr[i++] = right_arr[r++];
			}
		}
		/*
		 * The second while loop from lines 22 to 24 checks that if only elements in the left_arr are left then simply append them to arr
		 */
		while(l < left_size){
			arr[i++] = left_arr[l++];
		}
		/*
		 * The third while loop from lines 28 to 30 does the same but for the right_arr.
		 */
		while(r < right_size){
			arr[i++] = right_arr[r++];
		}
	}
	/**
	 * Implement the merge sort is based on the recursion
	 * You start by calling the mergeSort method as shown on line 94 with the following input parameters:
	 * @param arr - The array to be sorted
	 * @param len - The length of the array to be sorted
	 */
	public static void sort(int[] arr, int len) {	
		/*
		 * The method first checks the base case which is, that if the length of the array is less than 2 then return the array as it is,
		 * as shown on line 39.
		 */
		if (len < 2){return;}
		/*
		 * If the base case is not satisfied then the method creates two arrays; the left and right subdivision and recursively calls itself 
		 * on these two arrays which now contain the copied data of the original array
		 */
		int mid = len / 2;		
		int[] left_arr = new int[mid];
		int[] right_arr = new int[len-mid];
		//Dividing array into two and copying into two separate arrays
		int k = 0;
		for (int i = 0; i < len; i++) {
			if(i < mid) {
				left_arr[i] = arr[i];
			} else {
				right_arr[k] = arr[i];
				k = k+1;
			}
		}
		//Recursively calling the function to divide the subarrays further
		sort(left_arr, mid);
		sort(right_arr, len-mid);
		//Calling the merge method on each subdivision
		merge(left_arr, right_arr, arr, mid, len-mid);
	}
	/**
	 * Java application runner method
	 */
	public static void main(String[] args) {
		int [] array = {90,23,101,45,65,23,67,89,34,23};
		sort(array, array.length);
		for(int i = 0; i < array.length; i++){
			if(i != array.length - 1) {
				System.out.print(array[i]+ ", ");
			} else {
				System.out.print(array[i]+ "");
			}
		}
	}	
}