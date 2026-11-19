package com.day1;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Java"; // creates an object reference in pool
		String s3 = new String ("Hello"); // creates obj in heap
		String s4 = "Hello";
		
		System.out.println(s1 == s4); // compares reference
		System.out.println(s1 == s3); // false as references are different
		System.out.println(s1.equals(s3)); // 

		String name = "Alice";
		String newName = name.concat("Max");
		System.out.println(newName);
		System.out.println(name);
		
		System.out.println("length of name: " + name.length());
		
		System.out.println("\n==================\n");
		System.out.println(name.indexOf("l"));
		System.out.println(newName.indexOf("Max"));
		
		String capName = "ALICE";
		System.out.println(name.equals(capName));
		
		System.out.println(name.equalsIgnoreCase(capName));
		
		System.out.println(capName.toLowerCase());
		System.out.println(name.equals(capName.toLowerCase()));
		
		System.out.println("\n==================\n");
		String words = "Java,Python,C++,Java";
		words.replace("Java", "SQL");
		System.out.println(words);
		System.out.println("\n==================\n");
		
		String[] parts = words.split(",");
		for (String i : parts) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n==================\n");
		StringBuffer bf = new StringBuffer("Hello");
		bf.append("Java");
		System.out.println(bf);
		
		String s5 = new String("Hello");
		s5.concat("Java");
		System.out.println(s5);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Java");
		System.out.println(sb);
		
		String s6 = "		Hello		";
		System.out.println(s6);
		
		String s7 = s6.trim();
		System.out.println(s7);
		
		
	}
	

}
