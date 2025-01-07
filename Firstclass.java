package javabasics;

public class Firstclass {

	
		public void get() {
			System.out.println("I am happy");
		}
			
			public void add() {
				System.out.println(4+6);
			}
			
			public static void subtract()
			{
				System.out.println(6-4);
			}


		public static void main(String[] args) {
			Firstclass objFirst=new Firstclass();
			objFirst.get();
			objFirst.add();
			subtract();
			
		}
		
}
