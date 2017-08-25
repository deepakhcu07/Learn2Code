package com.hr.deepak.warmpup.minimaxsum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        
        Arrays.sort(arr);
        
        long min = 0;
        long max = 0;
        long temp = 0;
        
        for(int i=1;i<=3;i++){
        	temp+=arr[i];
        }
        min = temp + arr[0];
        max = temp + arr[4];
        
        System.out.println(min + " " + max);
        		

	}

}
