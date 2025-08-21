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
        return arr;
    }
    public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for (int i = n-k; i < ans.length; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.println("Enter the step to rotate :");
        int k = sc.nextInt();
        int [] ans = rotateArray(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
