package com.ruibando.utils;

public class MainExec {
	public static void main(String[] args){
		//String test = null;
		boolean test;
		
		//Check HTML String
		//String test = Sanitizing.sanitize(args[0]);
		
		//Check byte length
//		String charset = "UTF-8";
//		test = StringUtils.byteCheck(args[0], Integer.parseInt(args[1]), charset);
		
		//Check string
		test = StringUtils.strCheck(args[0]);
		
		System.out.println(test);
	}
}
