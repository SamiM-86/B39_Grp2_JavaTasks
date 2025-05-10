package busra;

public class Week3_SwapNumbers {
    public static void main(String[] args) {
        /*
        SWAP NUMBERS
        Swap 2 numbers without creating a 3rd variable
        */

        int a = 5;
        int b = 10;


        a = a + b;

        b = a - b;

        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " +b);



    }
}
