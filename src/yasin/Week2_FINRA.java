package yasin;

import java.util.Scanner;

public class Week2_FINRA {
     /*
    3. Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        FINRA(num);
    }

    public static void FINRA(int num){

        if (num % 15 == 0){
            System.out.println("FINRA");
        }else if (num % 5 == 0){
            System.out.println("FIN");
        }else if (num % 3 == 0) {
            System.out.println("RA");
        }else{
            System.out.println(num);
        }
    }
}
