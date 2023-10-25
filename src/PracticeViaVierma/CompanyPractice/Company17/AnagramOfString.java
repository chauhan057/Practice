package PracticeViaVierma.CompanyPractice.Company17;

import java.util.Arrays;

public class AnagramOfString {
    public static void main(String[] args) {
        String a ="allergy";
        String b= "allergic";
        int res=0;
      char a1[]=a.toCharArray();
      char b1[]=b.toCharArray();
      if (a1.length!=b1.length){
          System.out.println("length not matched");
      }
        Arrays.sort(a1);
        Arrays.sort(b1);
        for (int i = 0; i <a1.length ; i++) {
            if (a1[i]!=b1[i])
            {
                res++;
            }
        }
        if (res!=0){
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }


    }
}
