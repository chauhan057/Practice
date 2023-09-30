package patternRevision;

public class palildromPattern {
    public static void main(String[] args) {
        int n=5;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //spcaes
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
//            1 half loop
            for (int j=i;j>=2;j--){

                System.out.print(" "+j);

            }
            // 2 half loop
            for (int j=1;j<=i;j++){
                System.out.print(" "+ j);
            }
            System.out.println();
        }
    }
}
