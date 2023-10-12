package CJT;

import java.util.HashSet;
import java.util.Iterator;

/* Hashset,TreeSet, LinkHashSet implements Set Interface
 Doesn't allow duplicate values no sequential order  random
 */
public class HashsetCollection {
    
    public static void main(String[] args) {

            HashSet<String> hs = new HashSet<String>();
            hs.add("UK"); // Only prints one UK
            hs.add("USA");
            hs.add("India");
            hs.add("Mexico");
            hs.add("Ecuador");
            hs.add("UK");
            System.out.println(hs);
            System.out.println(hs.isEmpty());
            System.out.println(hs.size());
            System.out.println("");

            Iterator<String> it = hs.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }

    }
}
