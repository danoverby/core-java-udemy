package CJT;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {
    /* HashMap is not synchronized or thread safe (use for single thread) like HashTable (ok for multithread) 
     * Hashtable will be locked when a thread is using so concurrent thread has to wait.
     * HashMap allows one null key and multiple null values HashTable does not.
     * HashMap uses Iterator see below. HashTable uses enumerator to iterate.
    */


    public static void main(String[] args) {
        // HashMap<Integer, String> hm = new HashMap<Integer,String>();
        // hm.put(0, "hello");
        // hm.put(21, "Goodbye");
        // hm.put(2, "fine day");
        // // hm.remove(21);
        // System.out.println(hm);
        // System.out.println(hm.get(21));
        // System.out.println("");

        // Set s = hm.entrySet();
        // Iterator i = s.iterator();

        // while(i.hasNext()) {
        //     Map.Entry mp = (Map.Entry) i.next();
        //     System.out.println("KEY: " + mp.getKey() + " VALUE: " + mp.getValue());
        // }

        
        Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
        ht.put(0, "Dan");
        ht.put(1, "Alisa");
        ht.put(2, "Daniel");
        ht.put(3, "Katie");
        
        Enumeration<Integer> keys = ht.keys();
        for(int i=0; i < ht.size(); i++) {
            Integer key = keys.nextElement();
            System.out.println(key + ": " + ht.get(key));
        }
    }
}
