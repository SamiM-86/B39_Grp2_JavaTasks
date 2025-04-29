package kubilay;

public class Week1_OddOrEven {

    public static void main(String[] args) {

        oddOrEven(65);
        oddOrEven(44);
        oddOrEven(0);
        oddOrEven(-10);
        oddOrEven(-23);

    }

    public static void oddOrEven(int num){

        if (num == 0 ){
            System.out.println(num + " is zero.");

        } else if(num % 2 == 0){
            System.out.println(num + " is an even number.");

        } else {
            System.out.println(num + " is an odd number.");

        }


    }
}
