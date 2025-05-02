package beril;

public class Week2_Finra {
    public static void main(String[] args) {


        finra(30);

    }

    public static void finra(int number) {

        for (int i = 1; i <= number; i++) {
            String result = "";
            if (i % 3 == 0) {
                result+="FIN";
            }
            if(i%5==0){
                result+="RA";
            }

            System.out.println(result.isBlank() ? i : result);
        }
    }


}
