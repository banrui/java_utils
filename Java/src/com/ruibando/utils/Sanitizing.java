package com.ruibando.utils;

public class Sanitizing {
	static public String sanitize( String string ) {
	      if(string==null)return "";
	      string = string.replaceAll("&" , "&amp;" );
	      string = string.replaceAll("<" , "&lt;"  );
	      string = string.replaceAll(">" , "&gt;"  );
	      string = string.replaceAll("\"", "&quot;");
	      string = string.replaceAll("'" , "&#39;" );
	      return string;
	   }

	   static public String unSanitize( String string ) {
	      if(string==null)return "";
	      string = string.replaceAll("&#39;" , "'" );
	      string = string.replaceAll("&quot;", "\"");
	      string = string.replaceAll("&gt;"  , ">" );
	      string = string.replaceAll("&lt;"  , "<" );
	      string = string.replaceAll("&amp;" , "&" );
	      return string;
	   }
}
