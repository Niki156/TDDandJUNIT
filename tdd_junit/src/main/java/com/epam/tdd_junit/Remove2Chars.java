package com.epam.tdd_junit;

public class Remove2Chars {

	protected String remove(String string) {
		// TODO Auto-generated method stub
		int stringLength=string.length();
		if (stringLength==0) {
			return "";
		}
		else if (stringLength==1)
		{
			return string.replace("A","");
		}
		else {
			String first2Chars=string.substring(0,2);
			first2Chars = first2Chars.replaceAll("A", "");
			return first2Chars+string.substring(2,string.length());
		}
		
	}

}
