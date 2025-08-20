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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First value repeating is "+arr[i]);
                }
            }
        }
    }
}
