package PracticeViaVierma;

import java.util.Locale;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str= "visHaL@cHaUHaN.@iS mY+BeST@@,FrieNd";
//        String regex="[^a-bA-B1-9]";
//        String[] arr=str.split(regex);
        String[] arr=str.split("[@.+,]{1,4}");
        String res="";
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase()+" ";
        }
        System.out.println(res);
    }
}
