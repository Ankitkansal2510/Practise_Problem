package com.ankit.Array_Problems;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestDemo {

	public static String removeDupsFromFile(String str) {
        String[] words = str.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

        for (int i = 0 ; i < words.length ; i++) {
            if (map.containsKey(words[i])) {
                int count = map.get(words[i]) + 1;
                map.put(words[i], count);
            } else {
                map.put(words[i], 1);
            }
        }

        StringBuilder result = new StringBuilder("");
        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()) {
            result.append(itr.next() + " ");

        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		String str="Hello Friends my name is Hello My name is Ankit";
		System.out.println(removeDupsFromFile(str));
		
	}
}
