package com.hr.deepak.warmpup.staircase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0;i<n;i++){
			//Printing Space
			for(int j=0;j<n-1-i;j++){
				System.out.print(" ");
			}
			//Print #
			for(int j=0;j<=i;j++){
				System.out.print("#");
			}
			//Print New Line
			System.out.println("");
		}
		in.close();

	}

}
