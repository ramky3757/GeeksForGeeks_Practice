package medium;

public class SearchInMatrix {
	
	
	public static void main(String[] args) {
		
		
		int mat[][] = { {10, 20, 30, 40},
						{15, 25, 35, 45},
						{27, 29, 37, 48},
						{32, 33, 39, 50} };
		
		search(mat, 4, 29);
		}
		
	
	
	public static boolean search(int[][] arr, int length, int key) {
		
		
		int start =0, end = length-1;
		
		while(start<length && end >=0) {
			
			if(arr[start][end] == key) {
				return true;
			} else if(arr[start][end] > key) {
				end --;
			} else {
				start ++;
			}
		}
		return false;
	}

}
