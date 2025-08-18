import java.util.*;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = 0;
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]== target) {
                    ans++;
                }
            }
        }
        System.out.println("Total number of pairs are "+ans);
        sc.close();
    }
}
