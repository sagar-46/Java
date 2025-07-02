import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int ans = 0;
        while (num>0) {
            ans = (ans*10) + (num%10);
            num= num/10;
        }
        System.out.println(ans);
    }
}
