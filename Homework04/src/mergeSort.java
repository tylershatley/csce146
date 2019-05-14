/*
 * Tyler Shatley 
 * csce146
 * hw04
 */
public class mergeSort {
	
	public void mergeSort(int [] a)
	{
		int size = a.length;
		if(size < 2)
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int [] left = new int[leftSize];
		int [] right = new int[rightSize];
		
		for(int i = 0; i < leftSize; i++)
			left[i] = a[i];
		
		for(int i = mid; i < size; i++)
			right[i-mid] = a[i];
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}
	
	public boolean mergeSortBool(int [] a)
	{
		int size = a.length;
		if(size < 2)
			return false;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int [] left = new int[leftSize];
		int [] right = new int[rightSize];
		
		for(int i = 0; i < leftSize; i++)
			left[i] = a[i];
		
		for(int i = mid; i < size; i++)
			right[i-mid] = a[i];
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
		return true;
	}
	
	public void merge(int [] left, int [] right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//left index
		int j = 0; //right index
		int k = 0; //a index
		
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public int mergeCount(int [] left, int [] right, int[] a)
	{
		int count = 0;
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//left index
		int j = 0; //right index
		int k = 0; //a index
		
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)
		{
			count++;
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)
		{
			count++;
			a[k] = right[j];
			j++;
			k++;
		}
		return count;
	}
	
	
	public void printMergeSort(int [] a)
	{
		System.out.println("Array in order brought to you by, mergeSort.");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
}

