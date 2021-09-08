package medium;

import java.util.Arrays;

public class NextGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NextGreatestNumber ng = new NextGreatestNumber();
		ng.nextGreatest(534976);

	}

	
	public void nextGreatest(int n) {
		
		String str = Integer.toString(n);
		char[] strArray = str.toCharArray(); 
		int i, min;
		
		for(i = strArray.length-1; i>0; i-- ) {
			
			if(strArray[i] > strArray[i-1]) {
				
				break;
			}
		}
		
		
		if(i == 0) {
			System.out.println("Not possible");
		} else {
			
			int x = i-1; min = i;
			
			for(int j = i; j<strArray.length; j++) {
				
				if(strArray[min]>strArray[j])
					min = j;
			}
			
			swap(strArray, i-1, min);
			
			Arrays.sort(strArray, i, strArray.length);
			
			
			for(char c: strArray) {
				System.out.println(c);
			}
			
			
		}
		
		
	}


	private void swap(char[] strArray, int x, int min) {
		// TODO Auto-generated method stub
		
		char temp = strArray[x];
		strArray[x] = strArray[min];
		strArray[min] = temp;
	}
	
	
}
