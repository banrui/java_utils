package com.ruibando.utils;

/**
 * @author ruibando
 * Utility tool for Java Project
 */
public class StringUtils {
	
	
	/**
	 * Check Byte length of string
	 * @param string
	 * @param length
	 * @param charset
	 * @return boolean
	 */
	public static boolean byteCheck(String string, int length, String charset){
        StringBuffer sb = new StringBuffer();
        int strCount = 0;

        try{
            for (int i = 0; i < string.length(); i++) {
              String tmpString = string.substring(i, i + 1);
              byte[] byteStr = tmpString.getBytes(charset);
              if (strCount + byteStr.length > length) {
                return false;
              } else {
                sb.append(tmpString);
                strCount += byteStr.length;
              }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
	
	/**
	 * Check String[0-9a-zA-Z]+]
	 * @param string
	 * @return Boolean
	 */
	public static boolean strCheck(String string) {
        if (!string.matches("[0-9a-zA-Z]+")) {
    	    return false;
        } 
	    return true;
	}	
	
}
