package com.full;

import java.util.Random;
import java.util.Scanner;

public class GAME {
	public static boolean matched=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random random= new Random();
			int target=random.nextInt(100);
			int result=proceed(target);
			if(matched==true) {
				System.out.println("Guess matched "+result+" moves used");
			}else {
				System.out.println("Moves finished, guess didn't matched");
			}
	}
	public static int proceed(int target) {
		Scanner sc=new Scanner(System.in);
		int count=0,input;
		for(int i=0;i<5;i++) {
			System.out.println("Input number:");
			input=sc.nextInt();
			if(input==target) {
				count++;
				matched=true;
				break;
			}else if(input>target) {
				count++;
				System.out.println("Input is high, you have "+(5-count)+" moves left");
			}
			else if(input<target) {
				count++;
				System.out.println("Input is low, you have "+(5-count)+" moves left");
			}
		}
		return count;
	}

}
