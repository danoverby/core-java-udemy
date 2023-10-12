package CJT;

import java.util.ArrayList;

public class CollectionsExamples {
    /* Show each number in array and number of times found in array */
    public static void main(String[] args) {
        int a[] = {1,1,3,4,3,5,3,6,5,6,7};
        ArrayList al = new ArrayList<Integer>();

        for(int i = 0; i < a.length; i++) {
            int k = 0;
            if(!al.contains(a[i])) {
                al.add(a[i]);
                k++;

                for(int j = i + 1; j < a.length; j++) {
                    if(a[i]==a[j])
                        k++;
                }
                    System.out.println(a[i] + " - " + k);
            }
        }
    }
}
