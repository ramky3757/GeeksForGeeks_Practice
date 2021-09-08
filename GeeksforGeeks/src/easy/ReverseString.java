package easy;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "Geeks";
		char[] chArray = s.toCharArray();
		int start = 0, end = s.length()-1;
		
		while(start < end) {
			
			swap(chArray, start, end);
			start++; end --;
			
		}
		
		System.out.println(new String(chArray));
	}

	private static void swap(char[] chArray, int start, int end) {
		
		char temp = chArray[start];
		chArray[start] = chArray[end];
		chArray[end] = temp;
		
	}

}
