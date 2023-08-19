package com.velocity.demo3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test {

	public static ArrayList<String> get1(){
		ArrayList<String>list=new ArrayList<>();
		list.add("Name");
		list.add("String");
		return list;
	}
	public static List<String> get2(){
		LinkedList<String>list=new LinkedList<>();
		list.add("Name");
		list.add("String");
		return list;
	}
	public static Vector<String> get3(){
		Vector<String>list=new Vector <>();
		list.add("Name");
		list.add("String");
		return list;
	}


	
	public static void main(String[] args) {
		
		List<String> list=get3();
		System.out.println(list);
		

	}

}
