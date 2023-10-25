package PracticeViaVierma.CompanyPractice.Company17;

import java.util.Arrays;

class SortedMergeArray{
    public static void main(String[] args) {
        int a1[]={1,3,5,7};
        int a2[]={0,2,6,8,9};

        int n=a1.length;
        int m =a2.length;

        int i=0,j=0;  //two pointer approach
        while (i<n){
            if (a1[i]>a2[j]){
                int temp =a1[i];
                a1[i]=a2[j];
                a2[j]=temp;
                fixArray2(a2);
            }
            i++;
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }

    private static void fixArray2(int[] a2) {
        for (int i = 1; i <a2.length ; i++) {
            if (a2[i-1]>a2[i]){
                int temp =a2[i];
                a2[i]=a2[i-1];
                a2[i-1]=temp;
            }

        }
    }
}

//same as  below code but use for loop
/*

class MergeSortedArrays {
    public static void mergeArrays(int[] arr1, int n, int[] arr2, int m) {
        int i = n - 1; // Last index of arr1
        int j = 0;     // First index of arr2

        for (; i >= 0 && j < m; i--) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                j++;
            }
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr1 = {1, 3, 5, 7};
        int m = 5;
        int[] arr2 = {0, 2, 6, 8, 9};

        mergeArrays(arr1, n, arr2, m);

        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("arr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
*/

 /*class MergeSortedArrays {
    public static void mergeArrays(int[] arr1, int n, int[] arr2, int m) {
        int i = n - 1; // Last index of arr1
        int j = 0;     // First index of arr2

        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        // After merging, sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr1 = {1, 3, 5, 7};
        int m = 5;
        int[] arr2 = {0, 2, 6, 8, 9};

        mergeArrays(arr1, n, arr2, m);

        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));
    }
}
*/