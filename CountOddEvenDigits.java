package javaPrograms;

import java.util.Scanner;

public class CountOddEvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();		
		int evencount=0;
		int oddcount=0;
		while(num!=0)
		{
			int lastdigit=num%10;
			if(lastdigit%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("Odd Numbers "+oddcount);
		System.out.println("Even Numbers "+evencount);
	}
}
