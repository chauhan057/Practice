package PracticeViaVierma.CompanyPractice.Company17;

public class SumOfTwoArray {
    public static void main(String[] args) {
       // int arr[] ={1, -2, 3, 0, 5};
        int arr[] ={1, -2, 1, 0, 5};

        int x=0;
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        if (count>0){
//            System.out.println(count);
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
