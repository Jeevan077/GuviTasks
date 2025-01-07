package javabasics;

public class Forwhile {

	public static void main(String[] args) {
		
		// FOR LOOP ----> To Repeat Code Block
		
		for(int i=0;i<5;i++) 
		{
			System.out.println(i);
		}
		
		// Printing the number from 1 to 10
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(i);
			}
		
		//While Loop
		// Do something until specified condition is reached
		//Printing numbers 0 to 4
		int x=0;
		System.out.println("Output of while loop is : ");
		while(x<5)
		{
			System.out.println(x);
			x++;
		}
		
		int y=1;
		System.out.println("Output of while loop is : ");
		while(y<=10)
		{
			System.out.println(y);
			y++;
		}
		
		//Printing from 10 to 0
		
		int z=10;
		System.out.println("Output of while loop is : ");
		while(z>=0)
		{
			System.out.println(z);
			z--;
		}
		
		//DO WHILE LOOP
		
	// Loop is always executed atleast once even f the condition is false
		//Because the code is executed before the condition is tested.
		
		//Printing number from 0 to 4
		int a=0;
		do
		{
			System.out.println(a);
			a++;
		} while(a<5);
		
	}
	

}
