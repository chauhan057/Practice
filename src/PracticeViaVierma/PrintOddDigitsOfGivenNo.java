package PracticeViaVierma;

public class PrintOddDigitsOfGivenNo {
    public static void main(String[] args) {

        System.out.println(printOdd("7398668427"));

    }

    public static String printOdd(String num){
        String arr="";
        for (int i = 0; i < num.length(); i++) {

            if (num.charAt(i)%2!=0){
                arr=arr+num.charAt(i);
//                System.out.print(num.charAt(i));
            }
        }
        return arr;
//        System.out.println(arr);


    }

}

