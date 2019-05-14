/*
 * Tyler Shatley
 */
public class selectionSort {
	
	public void selectionSort(int [] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
	            int index = i;
	            for (int j = i + 1; j < a.length; j++)
	            {
	                if (a[j] < a[index]) 
	                {
	                	index = j;
	                }
	                else
	                {
	                	//do nothing
	                }
	            }
	      
	            int smallerNumber = a[index];  
	            a[index] = a[i];
	            a[i] = smallerNumber;
	    }	
	}
	
	public boolean selectionSortBool(int [] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
	            int index = i;
	            for (int j = i + 1; j < a.length; j++)
	            {
	                if (a[j] < a[index]) 
	                {
	                	index = j;
	                }
	                else
	                {
	                	//do nothing
	                }
	            }
	      
	            int smallerNumber = a[index];  
	            a[index] = a[i];
	            a[i] = smallerNumber;
	    }	
		return true;
	}
	
	public int selectionCount(int [] a)
	{
		int count = 0;
		for(int i = 0; i < a.length - 1; i++)
		{
	            int index = i;
	            for (int j = i + 1; j < a.length; j++)
	            {
	            	count++;
	                if (a[j] < a[index]) 
	                {
	                	index = j;
	                }
	                else
	                {
	                	//do nothing
	                }
	            }
	      
	            int smallerNumber = a[index];  
	            a[index] = a[i];
	            a[i] = smallerNumber;
	    }
		return count;
	}
	
	public void printselectionSort(int [] a)
	{
		System.out.println("Array in order brought to you by, selectionSort.");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
