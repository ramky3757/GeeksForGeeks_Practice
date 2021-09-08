package easy;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		SortArray s = new SortArray();
		int N =4;
		
		int arr[] = {1, 5, 3, 2};
		
		s.sortArr(arr, 0, arr.length-1 );
		System.out.println(Arrays.toString(arr));
	}
	
		
	void sortArr(int[] arr, int beg, int end ) 
    {   
		if (beg<end)  
		{  
		int mid = (beg+end)/2;  
		sortArr(arr, beg, mid);  
		sortArr(arr , mid+1, end);  
		merge(arr, beg, mid, end);  
		}  
       
    }
    
    void merge(int[] arr, int beg, int mid, int end){
    	
    	
    	int l = mid - beg + 1;  
    	int r = end - mid;  
    	  
    	int LeftArray[] = new int [l];  
    	int RightArray[] = new int [r];  
    	  
    	for (int i=0; i<l; ++i)  
    	LeftArray[i] = arr[beg + i];  
    	  
    	for (int j=0; j<r; ++j)  
    	RightArray[j] = arr[mid + 1+ j];  
    	  
    	  
    	int i = 0, j = 0;  
    	int k = beg;  
    	while (i<l&&j<r)  
    	{  
    	if (LeftArray[i] <= RightArray[j])  
    	{  
    	arr[k] = LeftArray[i];  
    	i++;  
    	}  
    	else  
    	{  
    	arr[k] = RightArray[j];  
    	j++;  
    	}  
    	k++;  
    	}  
    	while (i<l)  
    	{  
    	arr[k] = LeftArray[i];  
    	i++;  
    	k++;  
    	}  
    	  
    	while (j<r)  
    	{  
    	arr[k] = RightArray[j];  
    	j++;  
    	k++;  
    	}  
    	
    }
}
