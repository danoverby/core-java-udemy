package CJT;

import java.util.ArrayList;

public class Collections {
    
    public static void main(String[] args) {
        // ArrayList, LinkList, Vector - impliment List interface 
        // arrays are fixed size ArrayList is dynamic
        // Can access, add at any index and can have duplicate values
        ArrayList <String> a = new ArrayList<String>();
        a.add("Alisa");
        a.add("java");
        a.add("hannah");
        a.add(1, "inbetween");
        System.out.println(a);
        
        a.remove(1);
        a.remove("java");
        a.add("new string");
        System.out.println(a);
        System.out.println(a.contains("Alisa"));
        System.out.println(a.get(1));
        System.out.println(a.indexOf("hannah"));
        System.out.println("Array size: " + a.size());

    }
}
