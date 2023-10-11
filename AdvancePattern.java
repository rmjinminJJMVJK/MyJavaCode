public class AdvancePattern {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int num = 1;
//        HollowRectangle(n,m);
//        FloydTriangle(n,num);
//        NumberPyramid(n);
//        BinaryPattern(n);
//        BinaryPattern2(n);
//        Butterfly(n);
//        Rhombus(n);
//        HollowRhombus(n);
//        Diamond(n);
//        NumberFullPyramid(n);
        PalindromePyramid(n);
    }
    public static void HollowRectangle(int n ,int m){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void FloydTriangle(int n,int num){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void NumberPyramid(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n+1)-i; j++) {
                System.out.print(j );
            }
            System.out.println();
        }
    }
    public static void BinaryPattern2(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("0");
                } else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
    public static void BinaryPattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HollowRhombus(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++) {
                if (i == 1|| i == n || j == 1|| j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void NumberFullPyramid(int n){
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void PalindromePyramid(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}













