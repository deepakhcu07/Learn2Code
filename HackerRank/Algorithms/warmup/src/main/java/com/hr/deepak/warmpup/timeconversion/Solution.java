package com.hr.deepak.warmpup.timeconversion;

import java.util.Scanner;

public class Solution {
	
	static String timeConversion(String s) {
        String result ="";
        //Get its AM or PM
        String am = s.substring(s.length()-2, s.length());
        if(am.equals("AM")){
        	result = s.substring(0, s.length()-2);
        	//If its midnight
        	boolean midnight = s.substring(0, 2).equals("12");
        	if(midnight){
        		result = result.replace("12", "00");
        	}
        	return result;
        }else if(am.equals("PM")){
        	result = s.substring(0, s.length()-2);
        	String hh = s.substring(0, 2);
        	boolean noon = hh.equals("12");
        	if(noon){
        		return result;
        	}
        	int n = Integer.valueOf(hh);
        	result = result.replace(hh, (n+12)+"");
        	
        }
        		
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        
        in.close();
    }

}
