package CJT;

public class Loops {

    public void forLoop(int start, int end) {

        for(int i = start; i < end; i++) {
            if(i > 5) {
                System.out.println("i is greater than 5");
                System.out.println(i);
            } else {
                System.out.println("i is less than 5");
                System.out.println(i);
            }
        }
    }

    public void whileLoop(int start, int end) {
        int i = start;
        while(i <= end) {
            System.out.println(i);
            i++;
        }
    }

    // do-while runs at least once then evaluates
    public void doWhileLoop(int start, int end) {
        int i=end;
        do {
            System.out.println(i);
            i--;
        } while(i > start);
    }

    public void nestedLoop(int start, int end) {
        int k = 1;
        System.out.println("Start nested loop");
        for(int i = 0; i <= end; i++) {
            for(int j = start; j <= end-i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }

    public void nestedLoop2(int start, int end) {
        int k = 1;
        System.out.println("Start nested loop 2");
        for(int i = start; i <= end; i++) {
            for(int j = start; j+start <=start+i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }

    public void nestedLoop3(int start, int end) {
        System.out.println("Start nested loop 3");
        for(int i = start; i <= end; i++) {
            for(int j = start; j+start <=start+i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void nestedLoop4(int start, int end) {
        System.out.println("Start nested loop 4");
        int k = end;
        for(int i = start; i <= end; i++) {
            for(int j = start; j <= i; j++) {
                System.out.print(k + " ");
                k = k + end;
            }
            System.out.println("");
        }
    }

    public void layeredNumbersLoop(int start, int end) {
        System.out.println("");
        System.out.println("Loop with conditions");
        String a, b, c;
        a = b = c = "";
        String d = Integer.toString(end);

        for(int i = start; i < end; i++) {
            if (i <= 4) {
                a = a + i + " ";
            } else if (i >= 5 && i <= 7 ) {
                b = b + i + " ";
            } else if (i > 7 && i < 10) {
                c = c + i + " ";
            } 
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
