public class diagonalpattern1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i<=n; i++) {
            for (int j = 0; j<=n; j++) {
                if (i == j||(i == 0 && j == n) ||( i == 1 && j == n-1) || (i ==n-1 && j == 1) || (i == n && j == 0))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            
            System.out.println();

        }
    }
}