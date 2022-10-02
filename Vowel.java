package javalab;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the alphabet:");
		char ch=scan.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		System.out.println(ch + " is vowel");
		else
		System.out.println(ch + " is consonant");
		}
}
