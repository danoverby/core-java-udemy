package CJT;

public class exceptions {
    static int a = 7;
    static int b = 0;

    public static void main(String[] args) {
        try {
            // int k = a / b;
            int arr[] = new int[5];
            System.out.println(arr[7]);
        } catch(ArithmeticException ae) {
            System.out.println("Arithmetic error " + ae);

        } catch(IndexOutOfBoundsException ie) {
            System.out.println("I catch index out of bounds error " + ie);

        } catch(Exception e) {
            System.out.println("I catch error " + e);
        } finally {
            System.out.println("Finally runs no matter what exception is thrown ");
        }
    }
}
