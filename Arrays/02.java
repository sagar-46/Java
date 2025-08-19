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
        int ans = 0;
        // Traverse all pairs in a array 
        // Equal pairs are marked as -1
        // Traverse again and find value greater than -1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                ans = arr[i];
            }
        }
        System.out.println("The unique number is "+ans);
    }
}
