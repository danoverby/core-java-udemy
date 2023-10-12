package CJT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    
    public static ArrayList<String> names = new ArrayList<String>();
    static void fillList() {
        names.add("Adam");
        names.add("Dan");
        names.add("Alisa");
        names.add("Bob");
        names.add("Sam");
        names.add("Abraham");
    }

    // Another way to do above is 
    List<String> newNames = Arrays.asList("Adam", "Alisa", "Sam");
    
    // Count and print names starting with a
    public static void regularCode() {
        fillList();
        int count = 0;
    
        for(int i = 0; i < names.size(); i++) {
            
            String name = names.get(i);
    
            if(name.startsWith("A")) {
                count++;
            }
            System.out.println(name + ": " + count);
        }
    }

    public static void streamCode() {
        // fillList();
        // long c = names.stream().filter(n -> n.startsWith("A")).count();
        // Create stream directly without converting from ArrayList using ArrayListName.stream()
        
        Stream<String> s = Stream.of("Adam","Dan","Alisa","Bob","Sam","Abraham");
        Stream<String> s2 = Stream.of("Fred","Jack","Katie","Theodor","Drew","Ken");
        
        // s.filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));
        // long c = s.filter(n -> {
        //     Boolean isName = n.startsWith("A");
        //     if(isName)
        //         System.out.println(n);
        //     return isName;
        // }).count();
        // System.out.println(a);

        // s.filter(n -> n.endsWith("m")).map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
        // s.filter(n -> n.startsWith("A")).sorted().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));

        Stream<String> s3 = Stream.concat(s, s2);
        // s3.sorted().forEach(n -> System.out.println(n));
        boolean flag = s3.anyMatch(n -> n.equalsIgnoreCase("Alisa"));
        System.out.println(flag);
    }

    public static void main(String[] args) {
        streamCode();
        // regularCode();
    }
}
