package PracticeViaVierma.StringProblems.Level1;

public class ReverseString {
    public static void main(String[] args) {
        String str="This is Vishal Chauhan";
        reverseString(str);
    }
    private static void reverseString(String str) {
        String str2=str;
       char[] ch = str2.toCharArray();
       String s="";
       for (int i=ch.length-1;i>=0;i--){
           s+=str.charAt(i);
//           System.out.print(str.charAt(i));
       }
        System.out.println(s);
        System.out.println(s);



    }
}
