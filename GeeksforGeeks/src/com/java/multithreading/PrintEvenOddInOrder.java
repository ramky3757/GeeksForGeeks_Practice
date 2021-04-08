package com.java.multithreading;

public class PrintEvenOddInOrder extends Thread{
	
	// Starting counter
    int counter = 1;
  
    static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given Number N
        N = 10;
        
        PrintEvenOddInOrder eo = new PrintEvenOddInOrder();
        Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				eo.printEvenNumber();
				
			}
		});
		
        
        Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				eo.printOddNumber();
				
			}
		});
        
     // Start both threads
        t1.start();
        t2.start();
	}
	
	// Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {
  
                // If count is odd then print
                while (counter % 2 == 1) {
  
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
  
                // Print the number
                System.out.print(
                    counter + " ");
  
                // Increment counter
                counter++;
  
                // Notify to 2nd thread
                notify();
            }
        }
    }
    
 // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < N) {
  
                // If count is even then print
                while (counter % 2 == 0) {
  
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
  
                // Print the number
                System.out.print(counter + " ");
  
                // Increment counter
                counter++;
  
                // Notify to second thread
                notify();
            }
        }
    }

}
