package PracticeViaVierma.CompanyPractice.Company17;

import java.util.Arrays;


 class ShiftingOfZerosAtLeftSide {
    public static void main(String[] args) {
        int a[] = {1, 0, 1, 0, 3, 12};
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        while (j < a.length) {
            a[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(a));
    }
}



/*

//print left sidr
public class ShiftingOfZerosAtRightSide {
    public static void main(String[] args) {
        int a[] = {1, 0, 1, 0, 3, 12};
        int j = a.length - 1;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[j] = a[i];
                j--;
            }
        }

        while (j >= 0) {
            a[j] = 0;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}
*/
