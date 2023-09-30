package patternRevision;

public class Butterfly {
    public static void main(String[] args) {
        int n=5;
        //outer Loop
        for (int i=0;i<n;i++){
            //1 part
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            //space part
            int space =2*(n-i);
            for (int j=0
                 ;j<space;j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i=n;i>0;i--) {
            //1 part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //space part
            int space = 2 * (n - i);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
}
