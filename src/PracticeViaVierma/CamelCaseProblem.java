package PracticeViaVierma;

import java.util.regex.Pattern;

/*public class CamelCaseProblem {
    public static void main(String[] args) {
        String str= "visHaL cHaUHaN iS mY BeST FrieNd";
        str =str.toLowerCase();
        String[] arr =str.split(" ");

        String res="";

        for (int i = 0; i <arr.length ; i++) {
           // res=res+arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
            res=res+(""+arr[i].charAt(0)).toUpperCase()+arr[i].substring(1)+" ";

        }
        System.out.println(res.strip());

    }*/

public class CamelCaseProblem {
    public static void main(String[] args) {
        String str= "visHaL cHaUHaN iS mY BeST FrieNd";
        str =str.toLowerCase();
        String[] arr =str.split(" ");

        String res="";

        for (int i = 0; i <arr.length ; i++) {
            // res=res+arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
            res=res+(""+arr[i].charAt(0)).toUpperCase()+arr[i].substring(1)+" ";

        }
        System.out.println(res.strip());

    }



}
