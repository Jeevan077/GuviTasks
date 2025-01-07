package javabasics;

public class Operators {

	public static void main(String[] args) {
		
		//Addition of two numbers
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		System.out.println(sum);
		
		//Subraction of two numbers
		int c=12;
		int d=10;
		int e=c-d;
		System.out.println("The value is : " + e);
		
		//Converting string into Interger
		String n1="15";
		String n2="10";
		int a1=Integer.parseInt(n1);
		int b1=Integer.parseInt(n2);
		System.out.println(a1+b1);
		
		
		//Comparsion Operators
		int aa=7;
		int bb=12;
		System.out.println(aa>bb);
		System.out.println(aa<bb);
		System.out.println(aa>=bb);
		System.out.println(aa<=bb);
		System.out.println(aa!=bb);
		System.out.println(aa==bb);
		
		//Logical Operators
		
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		
		//Usage of float and double
		
		int q=5;
		int t=10;
		float p=(float)q/t;
		float u=25.67f;
		System.out.println(p);
		System.out.println(u);
		double s=(double)47000000.67000000 ;
		System.out.println(s);
		
		String firstname="Jeevan";
		String secondname="Sanjay";
		System.out.println("My full name is : " + firstname + " " + secondname);
		
		
	}
	

}
