package patternRevision;

public class solidrombus {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            int space1 =n-i;
            for (int j=space1;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }

          /*
            // isko likho ya nhi because this line of code is comming after Stars so no need to dedines
            int space2 =i-1;
            for (int j=1;j<=space2;j++){
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
}
