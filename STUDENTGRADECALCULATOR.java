package com.full;

import java.util.Scanner;

public class STUDENTGRADECALCULATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Input no of subjects:");
			int n=sc.nextInt();
			Float[] allMarks=new Float[n];
			System.out.println("Input Numbers:");
			for(int i=0;i<n;i++) {
				allMarks[i]=sc.nextFloat();
			}
			System.out.println("Total Marks:"+totalMarks(allMarks));
			System.out.println("Total Marks:"+average(allMarks,n));
			System.out.println("Grades:"+grades(average(allMarks,n)));
	}
	public static float totalMarks(Float[] allMarks) {
		float sum=0;
		for(int i=0;i<allMarks.length;i++) {
			sum+=allMarks[i];
		}
		return sum;
	}
	public static float average(Float[] num, float div) {
		// TODO Auto-generated method stub
		return totalMarks(num)/div;
	}
	public static char grades(float num) {
		if(num<=100 && num>=90) {
			return 'O';
		}else if(num<=89 && num>=80) {
			return 'E';
		}else if(num<=79 && num>=70) {
			return 'A';
		}else if(num<=69 && num>=60) {
			return 'B';
		}else if(num<=59 && num>=50) {
			return 'C';
		}else if(num<=49 && num>=40) {
			return 'D';
		}else{
			return 'F';
		}
	}
}
