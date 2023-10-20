package KPractice.StringProblems;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public Boolean notHaveRepeatedChar(String s)
    {
        boolean flag=false;
        String[] arr=s.split("");
        Set<String> set=new HashSet<>();

//        set.addAll(Arrays.asList(arr));

        for (String s1:arr) {
            set.add(s1);
        }
        if (set.size()==s.length())
        {
            flag=true;
        }

        return flag;
    }
    public static void main(String[] args) {

       LongestSubstringWithoutRepeatingChar obj=new LongestSubstringWithoutRepeatingChar();

        String str="aabbacbbaa";
        int l= str.length();
        if (str.length()==0||str==null)
        {
            System.out.println(str.length());
        }
        else {


            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j >= 0; j--) {
                    if (obj.notHaveRepeatedChar(str.substring(j, l - i + j))) {
                        System.out.println(str.substring(j, l - i + j).length());
                        i = str.length();
                        break;
                    }
//                System.out.println(str.substring(j,l-i+j));

                }
//            System.out.println();
            }
        }
        /*for (int i = str.length(); i >=0; i--) {


        }*/


    }






    /*public static void main(String[] args) {
        String res="";
        int count =0;
        String s="abcabcbb";  //ans =abc
        for (int i =0;i<s.length()-1;i++){
            char[] str= new char[]{s.charAt(i)};
            System.out.println(str);
            if (str[i]!=str[i+1]){
                res=res+1;
                count++;
            }
        }
        System.out.println(res.length());
    }*/



}
