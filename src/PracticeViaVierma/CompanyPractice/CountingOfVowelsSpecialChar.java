package PracticeViaVierma.CompanyPractice;

import java.util.regex.*;

public class CountingOfVowelsSpecialChar {
    public static void main(String[] args) {
        String str="Aaditya@123, my name is aaditya";
        String regex=".*[,+aeiou@ ].*";
        str.split(regex);
        int count=0;


        for (int i = 0; i < str.length(); i++) {
            if (Pattern.matches(regex,""+str.charAt(i)))
            {
                System.out.print(str.charAt(i));
                count++;
            }
        }
        System.out.println("\ncount="+count);
    }
}
