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
    public static int[] makefreq(int[] arr){
        int[] freq = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = inputArray();
        int[] freq = makefreq(arr);
        System.out.println("Enter the no: of queries :");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the number to be searched");
            int x = sc.nextInt();
            if (freq[x] >  0) {
                System.out.println("The number is present");
            }else{
                System.out.println("The number is not present");
            }
            q--;
        }
        sc.close();
    }
}
