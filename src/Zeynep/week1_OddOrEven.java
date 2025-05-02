package Zeynep;

import java.util.Scanner;

public class week1_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=scanner1.nextInt();
        if (number%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

scanner1.close();


    }
}
