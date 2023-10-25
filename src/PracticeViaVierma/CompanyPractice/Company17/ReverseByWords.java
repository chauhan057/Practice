package PracticeViaVierma.CompanyPractice.Company17;

public class ReverseByWords {
    public static void main(String[] args) {
        String s ="i like very much";
        String str[]=s.split(" +");
//        System.out.println(Arrays.toString(str));
        for (int i = str.length-1; i >=0; i--) {
            System.out.print(" "+str[i].trim());
        }
    }

}
