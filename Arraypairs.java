public class Arraypairs {
    public static void printpairs(int arr[]){
        int totpair = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("("+curr+ "," +arr[j]+ ")");
                totpair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+totpair);
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10};
        printpairs(arr1);
    }
    
}
