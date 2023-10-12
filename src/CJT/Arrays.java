package CJT;

public class Arrays {
    public void numberArray() {
        String a[] = new String[3];
        a[0] = "Alisa";
        a[1] = "Katie";
        a[2] = "Dan";
        int b[] = new int[] {1,2,3,4,5};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println("");
    }

    public void multidimensionalArray() {
        System.out.println("");
        String a[][] = new String[2][3];
        a[0][0] = "Row1, Col 1"; 
        a[0][1] = "Row1, Col 2"; 
        a[0][2] = "Row1, Col 3"; 
        a[1][0] = "Row2, Col 1"; 
        a[1][1] = "Row2, Col 2"; 
        a[1][2] = "Row2, Col 3"; 

        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);
            }
        }

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
        }
        System.out.println("");
    }
    
    public void minNumInMultiArray() {
        System.out.println("");
        int b[][] = {{12,2,3},{4,99,6},{7,8,9}};
        int min = b[0][0];
        int max = b[0][0];
        int minColumn = 0;
        int minColumnMaxValue = 0;

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                if(b[i][j] < min) {
                    min = b[i][j];
                    minColumn = j;
                }
                if(b[i][j] > max) {
                    max = b[i][j];
                }
            }
        }

        //Find  max value for column with min value
        for(int i=0; i < b[0].length; i++) {
            if(b[i][minColumn] > minColumnMaxValue)
                minColumnMaxValue = b[i][minColumn];
        }


        System.out.println("Min equals: " + min);
        System.out.println("Max equals: " + max);
        System.out.println("Max value for min value column equals: " + minColumnMaxValue);
    }

    public void sortArray() {
        System.out.println("");
        System.out.println("Swapped array");
        // swap without using a temp variable
        int a = 5;
        int b = 4;
        a = a + b; //9
        b =  a -b; //5
        a = a -b; //4

        int c[] = {4,2,16,7,3,9,34};
        for(int i=0; i < c.length; i++) {
            for(int j=i+1; j < c.length; j++) {
                if(c[i] > c[j]) {
                    c[i] = c[i] + c[j];
                    c[j] = c[i] - c[j];
                    c[i] = c[i] - c[j];
                }
            }
            System.out.print(c[i] + ", ");
        }

    }
}
