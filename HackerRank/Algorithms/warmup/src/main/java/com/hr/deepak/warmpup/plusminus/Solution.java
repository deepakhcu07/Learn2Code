package com.hr.deepak.warmpup.plusminus;

import java.util.Scanner;

public class Solution {
	
	static float []  getFractions(int n, int []array){
		float []result = new float[3];
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for(int a : array){
			if(a>0){
				positive++;
			}else if(a<0){
				negative++;
			}else{
				zero++;
			}
		}
		
		result[0] = (float)positive/n;
		result[1] = (float)negative/n;
		result[2] = (float)zero/n;
		
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = in.nextInt();
		}
		
		
		in.close();
		
		float []result = getFractions(n, array);
		
		System.out.printf("%.6f \n",result[0]);
		System.out.printf("%.6f \n",result[1]);
		System.out.printf("%.6f \n",result[2]);

	}

}
