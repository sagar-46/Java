import java.util.*;
public class program {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of the Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = inputArray();
        // Using two pointer 
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
