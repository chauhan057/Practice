package KPractice.StringProblems.Level1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestPrefixInSorted {
    public static void main(String[] args) {
        String[] s= {"abc","abcd","abcde"};
        Arrays.sort(s);
        String prefixFirst=s[0];
        String prefixLast = s[s.length-1];
        int index=0;

//        System.out.println(prefixLast);
        for (int i = 0; i < s.length; i++) {
            if (prefixFirst.charAt(i)==prefixLast.charAt(i+1)){
                index++;
            }
            else {
                break;
            }
            if (index==0){
                System.out.println("");
            }
            else {

            }
        }



    }
}
