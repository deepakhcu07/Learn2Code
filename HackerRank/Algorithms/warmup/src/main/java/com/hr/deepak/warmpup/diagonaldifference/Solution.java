package com.hr.deepak.warmpup.diagonaldifference;

import java.util.Scanner;

public class Solution {
	
	static int getDiagonalDifference(int n, int [][]matrix){
		int result = 0;
		int primaryDiagonal = 0;
		//Primary Diagonal
		for(int i=0;i<n;i++){
			primaryDiagonal = primaryDiagonal + matrix[i][i];
		}
		
		//Secondary Diagonal
		int secondaryDiagonal = 0;
		for(int i=n-1;i>=0;i--){
			int j = (n-1)-i;
			secondaryDiagonal = secondaryDiagonal + matrix[i][j];
		}
		if(primaryDiagonal > secondaryDiagonal){
			result = primaryDiagonal - secondaryDiagonal;
		}else{
			result = secondaryDiagonal - primaryDiagonal;
		}
		return result;
	}
	
	public static void main(String ar[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][]matrix = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = in.nextInt();
			}
		}
		
		int result = getDiagonalDifference(n, matrix);
		
		System.out.println(result);
		
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
		
	}

}
