package com.String;

public class Stringclass {

	public static void main(java.lang.String[] args) {

		// 1. Different ways creating a string

		String str1 = "This is a string";
		System.out.println(str1 + " : Creating string in \"String Constant pool\" ");

		String str2 = new String("This is another string");
		System.out.println(str2 + " : Creating String in memory \"heap\" ");

		// 2. Concatenating two strings using + operator

		String a = "Prabha";
		String b = "Vathi";
		String name = a + b;

		System.out.println(name);

		// 3. Finding the length of the string
		String st = "String Length";

		int len = st.length();

		System.out.println(st + " and length of st is : " + len);

		// 4. Extract a string using Substring

		String stri = "Madhu Prabha";

		String sub = stri.substring(5, 12);

		System.out.println(sub + " is the substring ");

		// 5. Searching in strings using indexOf()
		String str = "Madhu Babu";

		int ind = str.indexOf("Madhu");

		int ind2 = str.indexOf("B");

		System.out.println("Madhu index is " + ind);

		System.out.println("index of \"B\" in str is " + ind2);

		// 6. Matching a String Against a Regular Expression With matches()

		String mstr = "String Matching";

		boolean match = mstr.matches("(.*)String(.*)");

		System.out.println("Matches is : " + match);

		/*
		 * 7. Comparing strings using the methods equals(), equalsIgnoreCase(),
		 * startsWith(), endsWith() and compareTo()
		 */
		String cs1 = "Comparing strings";
		String cs2 = "Comparing strings";

		// two strings are compared using equals() method
		boolean e = cs1.equals(cs2);
		System.out.println("Equal : " + e);

		// equalsIgnoreCase() method ignores case differences
		String cms1 = "Devanshi";
		String cms2 = "devanshi";

		boolean eic = cms1.equalsIgnoreCase(cms2);
		System.out.println("Equal(ignore case) : " + eic);

		// startsWith() method checks string begins
		String cms3 = "class notes";
		boolean sw = cms3.startsWith("class");
		System.out.println("Starts with : " + sw);

		// endsWith() method checks string ending
		boolean ew = cms3.endsWith("otes");
		System.out.println("Ends with : " + ew);

		// compareTo() method returns 0 if both are equal
		int ct = cs1.compareTo(cs2);
		System.out.println("Compared : " + ct);

		// 9. Trimming strings with trim()
		String ts = "   Trimming String  ";
		// trim method() Removes leading and trailing spaces
		String trm = ts.trim();
		System.out.println("Trimmed : " + trm);

		// 10. Replacing characters in strings with replace()
		String rs = "devanshi";
		// replace() method, replaces all occurrences of 'g' to 'n'
		String rpl = rs.replace("d", "D");
		System.out.println("Replaced : " + rpl);

		// 11. Splitting strings with split()
		String ss = "Splitting String";
		// split() method breaks a given string around matches
		String[] spl = ss.split(" "); // splits space

		for (String i : spl) {
			System.out.println("Splitted : " + i);
		}

		// 12. Converting Numbers to Strings with valueOf()
		int ns = 11;
		// valueOf() method converts different types of values into string.
		String nTs = String.valueOf(ns);
		System.out.println("Converted Num to Str : " + nTs + 22);

		// 13. Converting integer objects to Strings
		int is = 11;
		// Integer.toString() method converts int to str
		String iTs = Integer.toString(is);
		System.out.println("Converted int to str : " + iTs + 33);

		// 14. Converting to uppercase and lowercase
		String i = "upper case";
		String j = "LOWER CASE";
		// toUpperCase() method converts lower to upper case
		String c = i.toUpperCase();
		// toLowerCase() method converts upper to lower case
		String d = j.toLowerCase();
		System.out.println("Converted to upper case : " + c);
		System.out.println("Converted yo lower case : " + d);

	}

}
