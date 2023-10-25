package PracticeViaVierma.CompanyPractice.Company17;

public class ItterateNumberPrint {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 6, 3, 6, 1};
        int res=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                   res= arr[j];
                    System.out.print(" "+res);
                }
            }
        }
    }
}
