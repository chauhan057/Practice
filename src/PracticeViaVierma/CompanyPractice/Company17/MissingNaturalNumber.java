package PracticeViaVierma.CompanyPractice.Company17;

public class MissingNaturalNumber {
    public static void main(String[] args) {
        int a[]={1,2,3,5};
        int n=5;

        int sum=0;
        int tSum =n*(n+1)/2;
//        System.out.println(tSum);
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
//            System.out.println(sum);
        }
        int x=tSum-sum;
        System.out.println(x);
    }


}
