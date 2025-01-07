package javabasics;

public class Stringclass {

	public static void main(String[] args) {
		String s ="I am happy";
		System.out.println(s.length());
		System.out.println(s.contains("I"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(4,9));
		System.out.println(s.isEmpty());
		String firstname="Jeevan";
		String secondname="Sanjay";
		System.out.println(firstname.concat(secondname)); //JeevanSanjay
	}

}
