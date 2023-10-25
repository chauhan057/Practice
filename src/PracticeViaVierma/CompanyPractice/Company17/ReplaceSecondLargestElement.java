package PracticeViaVierma.CompanyPractice.Company17;


public class ReplaceSecondLargestElement {
    public static void main(String[] args) {
//        int arr[]={4 , 5 , 2 , 25};
        int arr[]={13,7,6,12};
        int next;
        for (int i = 0; i <arr.length ; i++) {
            next=-1;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]<arr[j]){
               next=arr[j];
                    break;
                }
            }
                 System.out.print(" "+next);
        }
    }
}


