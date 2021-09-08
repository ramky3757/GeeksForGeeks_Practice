package easy;

public class XInEachSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XInEachSegment c = new XInEachSegment();
		
		int arr[] = new int[] { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25 };
			int x = 23, k = 5;
		System.out.println(c.xInKSegment(arr, x, k));;

	}

	public boolean xInKSegment(int[] arr, int target, int segment) {
		
	
		boolean check = false;
		
		for(int i=0; i< arr.length; i=i+segment) {
			
			if(i >0 && !check) break;
			
			// 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
			for(int j=0; j<segment; j++) {
				
				if(arr[i+j] == target && i+j <arr.length) {
					check = true;
					break;
				}
				
			}
		}
		return check;
	}
	
}
