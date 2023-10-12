package CJT;

public class Strings {
    // 2 ways to define a string (1. String literal 2. Create object of String)
    String a = "Java Training"; // string litteral
    String b = new String("hello,"); // create using new class object
    
    public void charOptions() {
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("n"));
        System.out.println(a.substring(5, 10));
        System.out.println(a.substring(5));
        System.out.println(a.concat(" need more"));
    }
    
    public void reverseString() {
        String a = "abcdefg";
        String b = "";
        
        for(int i = a.length() -1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }
    
    public void test() {
        String immutableString = "abc";
        immutableString.concat(" World");
    
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" World"); // string buffer is mutable

        System.out.println(immutableString);
        System.out.println(sb);
    }

    public void compare() {
        String a = "abc";
        String b = "abc"; // Same string literals the 2nd with point to 1st not create a space in memory
        String c = new String("abc"); // new creates a new memory space even when content is the same
        System.out.println(a == b); // true b point to a value in memory
        System.out.println(a == c); // false 2 different refs even though content is the same
        System.out.println(a.equals(b)); // true with equals content is evaluated not ref
        System.out.println(b.equalsIgnoreCase(c)); // true equals compares content
    }
}
