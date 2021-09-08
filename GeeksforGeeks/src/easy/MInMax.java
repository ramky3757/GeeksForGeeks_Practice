package easy;

public class MInMax {
	
	
	public static void main(String[] args) {
		
		int[] A = {1, 345, 234, 21, 56789};
		int min = A[0];
		int max = A[0];
		
		for(int i: A) {
			
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		
		System.out.println("Min is "+min+" Max is "+max);
		
	}

}
