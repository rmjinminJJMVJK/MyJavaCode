import java.util.Scanner;;
public class Arrayreverse {
    public static void Reverse(int arr[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int f = 0, l = arr.length-1;        //take 2 variables for swapping
        while(f<l){
            int temp = arr[l];              //SWAPPING METHOD
            arr[l] = arr[f];
            arr[f] = temp;
            f++;                        //for update first and last number
            l--;
        }
        
    }
    public static void main(String[] args) {
        int arr1[] = new int[5];
        Reverse(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
      
    }
}
