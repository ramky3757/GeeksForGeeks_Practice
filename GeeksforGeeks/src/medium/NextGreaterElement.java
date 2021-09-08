package medium;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4 };

		nextGreaterElement(arr);

	}

	public static void nextGreaterElement(int[] arr) {

		if (arr.length <= 1) {
			// base case
		}

		Stack<Integer> numStack = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (numStack.isEmpty()) {

				numStack.push(arr[i]);
			} else {

				if (arr[i] <= numStack.peek()) {
					numStack.push(arr[i]);
				} else {

					while (!numStack.isEmpty() && numStack.peek() < arr[i]) {

						int temp = numStack.pop();
						System.out.println(temp + " -> " + arr[i]);
					}

					numStack.push(arr[i]);
				}
			}

		}
	}

}
