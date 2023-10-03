package patternRevision;

public class TriangleHalf {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <n ; i++) {
            //innerLoopForSpace
            for (int j =1;j<n-i;j++){
                System.out.print(" ");
            }
            //innerlooforStar
            for(int j=1;j<=i;j++){
//                System.out.print(" "+"*"); //foe pyramid with above link
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
