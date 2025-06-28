import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i<= n) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}