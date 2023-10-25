package PracticeViaVierma.CompanyPractice;

import java.util.ArrayList;

public class ShiftingOfZeroes {
    public static void main(String[] args) {

        int[] arr={1,0,2,5,6,0,0,3,0,8,3,5,6,0};

        ArrayList<Integer> al=new ArrayList<>();
        int count=0;

        /// right shift
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
            {
                count++;
            }
            else {
                al.add(arr[i]);
            }
        }
        for (int i = 0; i < count; i++) {
            al.add(0);
        }
        System.out.println(al);

        /// Left Shift
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al0=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
            {
                al0.add(0);
            }
            else {
                al1.add(arr[i]);
            }
        }
        for (int i = 0; i < al1.size(); i++) {
            al0.add(al1.get(i));
        }
        System.out.println(al0);


    }
}
