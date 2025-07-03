import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int pow = 1,ans = 0;
        while (num > 0) {
            ans +=(num % 10) * pow;
            num /= 10;
            pow *= 2;
        }
        System.out.println(ans);
    }
}
