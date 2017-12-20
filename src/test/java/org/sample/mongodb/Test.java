package org.sample.mongodb;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	
	list.add("k");
	list.add("a");
	
	list.forEach(System.out::println);
	
	for(String s: list){
	    System.out.println(s);
	}

    }

}
