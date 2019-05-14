/*
 * Tyler Shatley
 *  csce146
 *  homework04
 */
import java.util.Random;
public class hw04 {
	public static final int MAX = 999; //0-999
	public static final int K = 1000; //1000 elements in the array
	public static final int C = 20;//five tests need to be ran.

	public static void main(String[] args) {
		
		System.out.println("Welcome to the sorting comparsion.\n");
		
		Random r = new Random(); //in-it of a new random
		int x = r.nextInt(MAX)+0; //in-it of the random number index 0-999
		int half = K/2;
		
		int done = 0;
		
		
		//created 4 arrays since we have to-do 4 methods
		int[][]selectionArr = new int[C][K]; //selection sort array
		int[][]bubbleArr = new int[C][K]; // bubble sort array
		int[][]mergeArr = new int[C][K]; //merge sort array
		int[][]quickArr = new int[C][K]; //quick sort array
		
		
		selectionSort selectionSort = new selectionSort();
		bubbleSort bubbleSort = new bubbleSort();
		mergeSort mergeSort = new mergeSort();
		quickSort quick = new quickSort();
		
		//creating total values for all arrays
		int selectionTotal = 0;
		int bubbleTotal = 0;
		int mergeTotal = 0;
		int quickTotal = 0;
		
		
		
		//this for loop creates the random 2d-array.
		for(int i = 0; i < C; i++)
		{
			x = r.nextInt(MAX)+0;
			for(int j = 0; j < K; j++)
			{
				x = r.nextInt(MAX)+0;
				selectionArr[i][j] = x;
				bubbleArr[i][j] = x;
				mergeArr[i][j] = x;
				quickArr[i][j] = x;
			}
		}
				
		//selection sort process  
		for(int i = 0; i < C; i++)
		{
			int [] temp = new int[K];
			for(int j = 0; j < K; j++)
			{
				temp[j] = selectionArr[i][j];
			}
			
			selectionTotal += selectionSort.selectionCount(temp);
			selectionSort.selectionSort(temp);
			
			for(int j = 0; j < K; j++)
			{
				selectionArr[i][j] = temp[j];
			}
			selectionSort.selectionSortBool(temp);
		}
		
		
				
		
		
		//bubble sort process 
		for(int i = 0; i < C; i++)
		{
			int [] temp = new int[K];
			//temp 
			for(int j = 0; j <K; j++)
			{
				temp[j] = bubbleArr[i][j];
			}
			
			bubbleTotal += bubbleSort.bubbleCount(temp);
			bubbleSort.bubbleSort(temp);
			
			for(int j = 0; j < K; j++)
			{
				bubbleArr[i][j] = temp[j];
			}
		}
		
		
		//merge sort process 
		for(int i = 0; i < C; i++)
		{
			int [] temp = new int[K];
			int [] left = new int[half];
			int [] right = new int [K-half];
			
			for(int j = 0; j < K; j++)
			{
				temp[j] = mergeArr[i][j];
			}
			
			for(int j = 0; j < half; j++)
			{
				left[j] = temp[j];
			}
			
			for(int j = half; j < K; j++)
			{
				right[j-half] = temp[j];
			}
		
			mergeSort.mergeSort(temp);
			
			for(int j = 0; j < K; j++)
			{
				mergeArr[i][j] = temp[j];
			}
		}
		
		
		//quick-sort process 
		for(int i = 0; i < C; i++)
		{
			int [] temp = new int[K];
			for(int j = 0; j < K; j++)
			{
				temp[j] = quickArr[i][j];
			}
			quickTotal += quick.partitionCount(temp, 0, K-1);
			quick.quickSort(temp, 0, K-1);
			
			for(int j = 0; j < K; j++)
			{
				quickArr[i][j] = temp[j];
			}
		}
		
		//printing the selection sort 
		System.out.println("Selection sort");
		for(int i = 0; i < K; i++)	
		{
			for(int j = 0; j < C; j++)
			{
				System.out.print(selectionArr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//bubble sort printing
		System.out.println("bubble sorting");
		for(int i = 0; i < K; i++)
		{
			for(int j = 0; j < C; j++)
			{
				System.out.print(bubbleArr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//merge sort printing
		System.out.println("merge sorting");
		for(int i = 0; i < K; i++)
		{
			for(int j = 0; j < C; j++)
			{
				System.out.print(mergeArr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//quick-sort printing
		System.out.println("quick sort");
		for(int i = 0; i < K; i++)
		{
			for(int j = 0; j < C; j++)
			{
				System.out.print(quickArr[j][i] + " ");
			}
			System.out.println();
		}		
	
	int u = 0;
	while(u < 4)
	{
		System.out.println("After 20 trials, selection sort had a total of " + selectionTotal + " sorts." +
				"\nMaking an average " + selectionTotal/20 + " per trial.");
		u++;
		System.out.println("After 20 trials, bubble sort had a total of " + bubbleTotal + " sorts." + 
				"\nMaking an average " + bubbleTotal/20 + " per trial.");
		u++;
		System.out.println("After 20 trials, merge sort had a total of " + mergeTotal + " sorts." + 
				"\nMaking an average " + mergeTotal/20 + " per trial.");
		u++;
		System.out.println("After 20 trials, quick sort had a total of " + quickTotal + " sorts." + 
				"\nMaking an average " + quickTotal/20 + " per trial");
		u++;
	}
	
	
	
	
}
}
	
	
