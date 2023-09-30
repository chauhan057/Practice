package patternRevision;

public class tri1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=(n-i+3);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
