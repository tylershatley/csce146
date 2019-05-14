/*
 * Tyler Shatley
 * csce146
 * HW04
 */
import java.util.*;
public class MainMethod {
	public static final int K = 1000;//k representing 10000
	public static final int blah = 999;//999 combinations
	public static final int t = 20;//tY representing 20
	public static void main(String[] args){
		
		System.out.println("Sorting Method Complexity Tester");
		Random r = new Random();
		int k = 0;
		int half = K/2;
		
		//creating total values for all arrays
		int selectionTotal = 0;
		int bubbleTotal = 0;
		int mergeTotal = 0;
		int quickTotal = 0;
				
		//init objects
				selectionSort selectionSort = new selectionSort();
				bubbleSort bubbleSort = new bubbleSort();
				mergeSort mergeSort = new mergeSort();
				quickSort quick = new quickSort();
		
		//loop that runs 20 times
		while(k < t)
		{
			System.out.println("Test ");
			
			//created 4 arrays since we have to-do 4 methods
			int[]selectionArr = new int[K]; //selection sort array
			int[]bubbleArr = new int[K]; // bubble sort array
			int[]mergeArr = new int[K]; //merge sort array
			int[]quickArr = new int[K]; //quick sort array
			
			//creating the random arrays (all are the same values)
			for(int i = 0; i < K; i++)
			{
				int x = r.nextInt(blah)+0;//random number 0-999
				selectionArr[i] = x;
				bubbleArr[i] = x;
				mergeArr[i] = x;
				quickArr[i] = x;
			}
			
			//selection sort
			selectionTotal += selectionSort.selectionCount(selectionArr);
			selectionSort.selectionSort(selectionArr);
			System.out.println("Selection Sort for trial " + k + " = " + selectionSort.selectionSortBool(selectionArr));
			selectionSort.printselectionSort(selectionArr);
			
			//bubble sort
			bubbleTotal += bubbleSort.bubbleCount(bubbleArr);
			bubbleSort.bubbleSort(bubbleArr);
			System.out.println("Bubble sort for trial " + k + " = " + bubbleSort.bubbleSortBool(bubbleArr));
			bubbleSort.printBubbleSort(bubbleArr);
			
			//merge sort
			int [] left = new int[half];
			int [] right = new int[K-half];
			
			//left array
			for(int i = 0; i < half; i++)
			{
				left[i] = mergeArr[i];
			}
			//right array
			for(int i = half; i < K; i++)
			{
				right[i-half] = mergeArr[i];
			}
			
			mergeTotal += mergeSort.mergeCount(left, right, mergeArr);
			mergeSort.mergeSort(mergeArr);
			System.out.println("Merge sort for trial " + k +  " = " + mergeSort.mergeSortBool(mergeArr));
			mergeSort.printMergeSort(mergeArr);
			
			//quick sort
			quickTotal+= quick.partitionCount(bubbleArr, 0, K-1);
			quick.quickSort(quickArr, 0, K-1);
			System.out.println("Quick sort for trial " + k +  " = " + quick.quickSortBool(quickArr, 0, K-1));
			quick.printQuickSort(quickArr);
			
			//increment
			k++;
		}
		System.out.println("After 20 trials, selection sort had a total of " + selectionTotal + " sorts." +
				"\nMaking an average " + selectionTotal/20 + " per trial.");
		System.out.println("After 20 trials, bubble sort had a total of " + bubbleTotal + " sorts." + 
				"\nMaking an average " + bubbleTotal/20 + " per trial.");
		System.out.println("After 20 trials, merge sort had a total of " + mergeTotal + " sorts." + 
				"\nMaking an average " + mergeTotal/20 + " per trial.");
		System.out.println("After 20 trials, quick sort had a total of " + quickTotal + " sorts." + 
				"\nMaking an average " + quickTotal/20 + " per trial");	
	}
}
