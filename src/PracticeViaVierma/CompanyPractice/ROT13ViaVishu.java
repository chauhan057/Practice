package PracticeViaVierma.CompanyPractice;

public class ROT13ViaVishu {
    public static void main(String[] args) {
        String str="aVishal zChauhan";
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if (c>='a' && c<='m'){
                c+=13;
            }else if (c>='A' && c<='M')
                c+=13;
            else if (c>='n'&&c<='z')
                c-=13;
            else if (c>='N'&& c<='Z') {
                c-=13;
            }
            System.out.print(c);

        }
    }

}
