package beril;

public class Week1_OddOrrEven {
    public static void main(String[] args) {

        oddOrEven(7);
        oddOrEven(12);
        oddOrEven(0);
        oddOrEven(-13);

    }

    public static void oddOrEven(int num) {

        if (num == 0) {
            System.out.println(num + " is 0");
        } else if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");

        }
    }
}
