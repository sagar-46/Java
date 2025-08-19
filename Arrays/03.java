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
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max  ) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = inputArray();
        int max = findMax(arr);
        // The First max is set to - infinity and again findMax is used
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        System.out.println("The Second Max is "+secondMax);
    }
}
