package com.lssdeveloper.tdd;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<String> converterCamelCase(String original) {
	    List<String> result = new ArrayList<>();
	    StringBuilder word = new StringBuilder();
	    for (int i = 0; i < original.length(); i++) {
	        char c = original.charAt(i);
	        if (Character.isUpperCase(c)) {
	            result.add(word.toString());
	            word.setLength(0);
	        }
	        word.append(c);
	    }
	    result.add(word.toString());
	    return result;
	}

}
