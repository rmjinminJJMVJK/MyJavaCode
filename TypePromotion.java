public class TypePromotion {
    public static void main(String args[]) {
        char a = 'A';           // Byte,Char,Short all are convert in integer
        char b = 'B';
        System.out.println(a); // Print the assign value
        System.out.println(b);

        System.out.println(b - a); // Type promotion only apply in expression

        System.out.println((int) a); // Type casting
        System.out.println((int) b);

        int p = 12;             // int,float,long,double all are convert into double
        float q = 25.25f;
        long r = 35;
        double s = 18;
        double Total = p + q + r + s;
        System.out.println(Total);


    }

}
