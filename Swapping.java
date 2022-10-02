package javalab;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
    	int temp;
    	Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the First Number: ");
	    int fNum = scan.nextInt();
	    System.out.print("Enter the Second Number: ");
	    int sNum = scan.nextInt();
	    System.out.println("Before Swapping: First Number="+fNum+" Second Number="+sNum);
	    temp = fNum;
	    fNum = sNum;
	    sNum = temp;
	    System.out.println("After Swapping: First Number="+fNum+" Second Number="+sNum);
    }
}
