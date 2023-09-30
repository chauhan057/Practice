package patternRevision;

public class diamondPattern {
    public static void main(String[] args) {
        int n=5;
        //upper part
        for (int i = 1; i <=n-1 ; i++) {
            //spaces
            int spaces =n-i;
            for (int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //1 part pattern
            for (int j=1;j<=i;j++){
                System.out.print(" "+"*");
            }
            //2nd part pattern
            for (int j=2;j<=i;j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        //lower part

        for (int i = n; i >=1 ; i--) {
            //spaces
            int spaces =n-i;
            for (int j=1;j<=spaces;j++){
                System.out.print( "  ");
            }
            //1 part pattern
            for (int j=1;j<=i;j++){
                System.out.print(" "+"*");
            }
            //2nd part pattern
            for (int j=2;j<=i;j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}
